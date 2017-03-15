package com.afp;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

import java.net.URL;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;

import com.fasterxml.jackson.annotation.*;

@JsonRootName(value="products")
@RestController
public class ProductController {

    @RequestMapping("/products")
    @ResponseBody 
    public String products(){
    	
    	String json = "";
    	
    	Product[] products = new Product[3];
    	products[0] = new Product(002, "Toy Car", "A toy car to play with", 2.99, 10);
    	products[1] = new Product(003, "Toy Boat", "A toy boat to play with", 8.99, 10);
    	products[2] = new Product(001, "Toy Plane", "A toy plane to play with", 4.99, 10);
    	
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
    	return "You are buying item "+String.format("%03d", sku);
    }
    
}