package com.ilp_basic_programming_selflearn;

import java.util.Scanner;

public class Basic_Patter_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		int colLimit ;
		colLimit = limit;
		for (int row = 1; row <= (limit * 2); row++) {
			if (row <= limit) {
				for (int col = 1; col <= row; col++) {
					System.out.print("* ");
				}

			} else {
				
				for (int col = 1; col <= 2*limit ; col++) {
					System.out.print("* ");

					
				}
				colLimit--;
			}

			System.out.println();
			

		}
	}

}
