package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q9Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit ");
		int limit = scanner.nextInt();
		
		for (int i =1;i<=limit;i++) {
			for (int j =i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
