package com.ilp_basic_programming_selflearn;


import java.util.Scanner;

public class Basic_Patter_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		int limit = scanner.nextInt();
		
		for (int row = 1; row <=limit; row++) {
			for(int col = 1;col <= limit - row+1;col++) {
				System.out.print("* ");
			}	
			
			
			
			System.out.println();
			
		}
	}

}
