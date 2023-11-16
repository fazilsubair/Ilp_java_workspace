package com.ilp.service;

import com.ilp.entity.*;

import com.ilp.entity.Product;

public class ServiceService {
	
	
	

	

	public static Service createService() {
		// TODO Auto-generated method stub
		Service service = new Service("SERV100","SERVICE_01",1000.0);
		
		return service;
	}

	public static void displayService(Service service) {
		// TODO Auto-generated method stub
		
		System.out.println("Service Code \tService Name \tService Price");
		System.out.println(service.getServiceCode() + "\t"+ service.getServiceName()+ " \t"+ service.getServicePrice());
	}

}
