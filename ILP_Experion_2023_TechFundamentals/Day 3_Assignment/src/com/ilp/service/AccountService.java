package com.ilp.service;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.CurrentAccount;
import com.ilp.entity.SavingsAccount;
//import com.ilp.entity.SavingAccount;

 
public class AccountService {
 

		public static Account createAccount() {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			Account account =null;
			System.out.println("Enter account type 1.Saving 2.Current");
			int acctype = scanner.nextInt();
			if(acctype==1)
				account= createSavingsAccount();
			else if(acctype==2)
				account = createCurrentAccount();
			return account;
		}
 
	public static void displayAccount(ArrayList <Account> accountList) {
		// TODO Auto-generated method stub
		SavingsAccount savAcc = null;
		CurrentAccount curAcc =null;
		System.out.println("Account No"+"    "+"Account Name"+"     "+"Account Balance");
		for(Account account:accountList) {
		   System.out.println(account.getAccountNo()+"   \t   "+account.getAccountName()+"  \t   "+account.getAccountBalance());
		if(account instanceof SavingsAccount)
			{
			savAcc = (SavingsAccount) account ;
			System.out.println("ROI : " + savAcc.getRoi());
			}
		else if(account instanceof CurrentAccount)
			{
			curAcc = (CurrentAccount) account ;
			System.out.println("GST : " + curAcc.getGstNo());
			}
		   
	}
	}
	  public static SavingsAccount createSavingsAccount() {
	    	System.out.println("enter Account No"+"    "+"Account Name"+"     "+"Account Balance");
	    	Scanner scanner = new Scanner(System.in);
	    	String accNo = scanner.nextLine();
	    	String accName = scanner.nextLine();
	    	double accBal = scanner.nextDouble();
			SavingsAccount SavAcc =new SavingsAccount(accNo,accName,accBal,"7%");
			return SavAcc;
	    }
	    public static CurrentAccount createCurrentAccount() {
	    	System.out.println("enter Account No"+"    "+"Account Name"+"     "+"Account Balance" );
	    	Scanner scanner = new Scanner(System.in);
	    	String accNo = scanner.nextLine();
	    	String accName = scanner.nextLine();
	    	double accBal = scanner.nextDouble();
	    	System.out.println("enter gst?");
//	    	scanner.next();
	    	String gst = scanner.next();
	    	CurrentAccount CurAcc =new CurrentAccount(accNo,accName,accBal,gst);
			return CurAcc;
	    }
	    
}