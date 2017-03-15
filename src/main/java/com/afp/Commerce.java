package com.afp;

public class Commerce {
	
	public Commerce(){
		System.out.println("======] Commerce Instantiated [======");
	}
	
	public String buy(Product product){
		//look up item from sku
		
		
		//check datastore for view count within the hour and calculate price
		
		return "You are buying product "+product.getName()+" for $"+product.getPrice();
	}
}