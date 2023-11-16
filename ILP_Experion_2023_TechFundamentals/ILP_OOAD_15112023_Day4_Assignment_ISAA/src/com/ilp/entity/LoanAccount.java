package com.ilp.entity;

import java.util.ArrayList;

public class LoanAccount extends Product {


	private double depositCharge = .3;



	public LoanAccount(String productCode, String productName, ArrayList<Services> serviceList) {
		super(productCode, productName, serviceList);
		
	}



	public double getDepositCharge() {
		return depositCharge;
	}



	public void setDepositCharge(double depositCharge) {
		this.depositCharge = depositCharge;
	}

}
