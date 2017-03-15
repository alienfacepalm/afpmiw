package com.afp;

public class Commerce {
	
	public Commerce(){
		System.out.println("======] Commerce Instantiated [======");
	}
	
	public String buy(Product product){
		ProductViewCounter counter = new ProductViewCounter();
		int count = counter.getCount(product.getSku());
		if(count >= 10){ 
			//the counter keeps track of the datetime and increments until it an hour has passed since the first count
			//If it's under and hour and over 10, use surge pricing....
		}
		return "You are buying product "+product.getName()+" for $"+product.getPrice();
	}
}