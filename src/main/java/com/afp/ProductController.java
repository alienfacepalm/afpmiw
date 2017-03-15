package com.afp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value="products")
@RestController
public class ProductController {

	private ProductStub stub = new ProductStub();
	private Product[] products = stub.getProducts();
	
    @RequestMapping("/products")
    @ResponseBody 
    public String products(){
    	
    	String json = "";
    	
    	try{
		ObjectMapper mapper = new ObjectMapper();	
		mapper.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, true);
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(products);
    	}catch(JsonGenerationException e){
    		e.printStackTrace();
    	}catch(JsonMappingException e){
    		e.printStackTrace();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	
    	return json;
    	
    }
    
    @RequestMapping("/buy")
    public String buy(@RequestParam("sku") int sku){
    	Commerce commerce = new Commerce();
    	Product product;
    	for(int i=0; i<this.products.length; i++){
    		if(this.products[i].getSku() == sku){
    			product = products[i];
    		}
    	}
    	return commerce.buy(products[1]);
    }
    
}