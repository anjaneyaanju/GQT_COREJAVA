/**
 * 
 */
package com.pattern1;

import java.util.Scanner;

/**
 * 
 */
public class Classpattern43{

	/**
	 * @description this example for 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
				
		}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("$ ");
			}
		System.out.println();

	}

}
}