package com.pattern1;

import java.util.Scanner;

public class Classpattern28 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }

	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(i + " ");
	            }

	            System.out.println();
	}
      }
} 
	
