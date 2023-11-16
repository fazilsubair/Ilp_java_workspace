package com.ilp.service;

import com.ilp.entity.Product;

public class ProductService {

	public static Product createProduct() {
		// TODO Auto-generated method stub
		
		Product product =  new Product("PRD100","Product_1",200);
		return product;
	}

	public static void displayProduct(Product product) {
		// TODO Auto-generated method stub
		
		System.out.println("1.Product Code \t2.Product Name \t3.Product Price");
		System.out.println(product.getProductCode()+"\t"+product.getProductName()+"\t"+product.getProductPrice());
	}
	
	
	

}
