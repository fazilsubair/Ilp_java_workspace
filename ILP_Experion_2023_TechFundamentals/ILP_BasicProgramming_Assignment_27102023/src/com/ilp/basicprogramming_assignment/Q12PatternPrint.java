package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q12PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int colum = scanner.nextInt();
		
		int count = 1;
		int leftSpace = colum -1;
		for(int i  = 1 ; i<=colum;i++) {
			
			for(int j  = leftSpace;j>=1;j--) {
				System.out.print(" ");
			}
			leftSpace--;
			
			for(int j = 1; j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		

	}

}
