package com.pattern1;
import java.util.Scanner;
public class Classpattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE *");
		int n=sc.nextInt();
		int count=1;
		for (int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+ " ");
				count++;
	
		}
			System.out.println();
			}
		

	}

}
