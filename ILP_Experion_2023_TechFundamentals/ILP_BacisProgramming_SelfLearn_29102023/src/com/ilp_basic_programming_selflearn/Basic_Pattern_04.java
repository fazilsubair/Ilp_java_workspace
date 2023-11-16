package com.ilp_basic_programming_selflearn;

import java.util.Scanner;

public class Basic_Pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();

		for (int row = 1; row <= limit; row++) {
			for (int col = 1; col <= row ; col++) {
				System.out.print(col+" ");
			}

			System.out.println();

		}
	}

}
