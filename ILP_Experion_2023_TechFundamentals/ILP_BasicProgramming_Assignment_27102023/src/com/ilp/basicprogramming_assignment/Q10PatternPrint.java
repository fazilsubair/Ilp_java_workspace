package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q10PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter limit");
		int limit = scanner.nextInt();
		char c = 'A';
		int leftSpace =limit*2;
		for (int i = 0;i<limit;i++) {
			
			for(int j = 1; j<leftSpace-1;j++) {
				System.out.print(" ");
			}
			leftSpace = leftSpace -2 ;

			c ='A';
			for (int k = 0; k<=i;k++,c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		

	}

}
