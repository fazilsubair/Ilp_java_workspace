package com.ilp.userentity;
import com.ilp.user.*;
public class UserEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		user.setCustomerCode("Avi200");
		user.setCustomerName("Avinash K");
		user.setCustomerContactNumber("1234567890");
		user.setCustomerDob("15-3-1999");
		user.setCustomerPincode("682107");
		user.setCustomerOpenDate("28-10-2023");
		
		user.getCustomerCode();
		user.getCustomerName();
		user.getCustomerContactNumber();
		user.getCustomerDob();
		user.getCustomerPincode();
		user.getCustomerOpenDate();
		System.out.println("Customer_Code\tCustomer_Name\t Customer_Contact/t Customer_DOB\t Customer_Pin\t Customer_Open_Date");
		System.out.println(user.getCustomerCode()+"\t\t"+user.getCustomerName()+"\t\t"+user.getCustomerContactNumber()+"\t\t"+user.getCustomerDob()+"\t\t"+user.getCustomerPincode()+"\t\t"+user.getCustomerOpenDate());





	}

}
