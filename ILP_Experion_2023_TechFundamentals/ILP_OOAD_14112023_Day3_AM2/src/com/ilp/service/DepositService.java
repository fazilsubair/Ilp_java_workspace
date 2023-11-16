package com.ilp.service;

public class DepositService extends AccountService {

	public static void depositMoney(double amt,String slipno ) {
		// TODO Auto-generated method stub
		
		System.out.println("over the counter deposit ");
		
	}
	
	public static void depositMoney(String chequeNo ) {
		// TODO Auto-generated method stub
		
		System.out.println("check deposit");
		
	}
	
	public static void depositMoney(String dDno,String branch ) {
		// TODO Auto-generated method stub
		
		System.out.println("Demand Draft depositing");
		
	}

	@Override
	public void freeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Free tansaction implemented for Deposit service");
	}
	
	
	

}
