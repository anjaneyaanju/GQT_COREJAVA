/**
 * 
 */
package com.pattern1;

import java.util.Scanner;

/**@author Veeresh
 * @desciption this conatins source code for the pattern
 */
import java.util.Scanner;
public class Classpattern41 {

	/**
	 * @param args
	 * @description this contains source code for pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0 || i==n-1||j==0||j==i)
				System.out.print("# ");
				else {
					System.out.print("- ");
				}
				}
	
			System.out.println();
		}

	}

}
