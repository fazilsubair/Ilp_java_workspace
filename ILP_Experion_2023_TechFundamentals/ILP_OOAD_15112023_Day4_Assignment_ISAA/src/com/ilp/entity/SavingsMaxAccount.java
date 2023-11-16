package com.ilp.entity;

import java.util.ArrayList;

public class SavingsMaxAccount extends Product {


	
	public SavingsMaxAccount(String productCode, String productName, ArrayList<Services> serviceList) {
		super(productCode, productName, serviceList);
		// TODO Auto-generated constructor stub
	}
public static boolean minimumBalance(double d) {
	if(d < 1000) {
		System.out.println("minimum balance is 1000 for savings max account");
		return false;
	}
	else {
	return true;}
}
	
}
