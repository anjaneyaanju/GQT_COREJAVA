
package com.pattern1;

import java.util.Scanner;

public class Classpattern13 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE:");
		int n=sc.nextInt();
		
	for(int i=1;i<n;i++){
		int count=i;
		for(int j=1;j<n;j++) {
				System.out.print(count+" ");
				count=count+n;
				
			}
		System.out.println();
		}
	}

}
