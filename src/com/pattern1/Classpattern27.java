package com.pattern1;

import java.util.Scanner;

public class Classpattern27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
		int n=sc.nextInt();
		int space=n-1;
      for (int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++) 
				System.out.print("  ");
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			for(int j=1; j<=i-1; j++) 
				System.out.print((i-j)+" ");
			space--;
			System.out.println();
	}
	}
}
