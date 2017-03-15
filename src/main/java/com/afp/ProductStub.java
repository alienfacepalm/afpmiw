package com.afp;

public class ProductStub {
	
	public ProductStub(){}
	
	public Product[] getProducts(){
		Product[] products = new Product[3];
    	products[0] = new Product(001, "Toy Car", "A toy car to play with", 2.99, 10);
    	products[1] = new Product(002, "Toy Boat", "A toy boat to play with", 8.99, 10);
    	products[2] = new Product(003, "Toy Plane", "A toy plane to play with", 4.99, 10);
    	
    	return products;
	}
	
}