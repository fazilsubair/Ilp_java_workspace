package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q11PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter limit");
		int limit = scanner.nextInt();
		
		
		for (int i =limit ; i>0;i--) {
			
			for (int j = limit; j>limit-i;j--) {
				System.out.print(j+" ");

			}
		System.out.println();	
		}
	}

}
