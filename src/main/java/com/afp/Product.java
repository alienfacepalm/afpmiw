package com.afp;

public class Product {

	private int sku;
    private String name;
    private String description;
    private double price;
    private int inStock;

    public Product(){}
    
    public Product(int sku, String name, String description, double price, int inStock) {
    	this.sku = sku;
        this.name = name;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }
    
    public int getSku(){
    	return sku;
    }
    
    public void setSku(int sku){
    	this.sku = sku;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public double getPrice(){
    	return price;
    }
    
    public void setPrice(double price){
    	this.price = price;
    }
    
    public int getInStock(){
    	return inStock;
    }
    
    public void setInStock(int inStock){
    	this.inStock = inStock;
    }
    
}