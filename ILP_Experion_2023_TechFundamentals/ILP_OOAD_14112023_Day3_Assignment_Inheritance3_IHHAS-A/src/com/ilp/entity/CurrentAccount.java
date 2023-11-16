package com.ilp.entity;

public class CurrentAccount extends Account {
	private String gstNO;

	
	
	
	public CurrentAccount(String accountNo, String balance, Product product, String gstNO) {
		super(accountNo, balance, product);
		this.gstNO = gstNO;
	}

	public String getGstNO() {
		return gstNO;
	}

	public void setGstNO(String gstNO) {
		this.gstNO = gstNO;
	}
	
	

}
