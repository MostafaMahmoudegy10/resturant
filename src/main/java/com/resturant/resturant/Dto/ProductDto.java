package com.resturant.resturant.Dto;

public class ProductDto {
	private String name;
	
	private int price;
	
	private String description;
	
	private String lang;

	public ProductDto(String name, int price, String description, String lang) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.lang = lang;
	}
	
}
