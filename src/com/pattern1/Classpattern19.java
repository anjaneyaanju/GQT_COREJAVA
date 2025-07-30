package com.pattern1;
import java.util.Scanner;
public class Classpattern19 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
						System.out.println("ENTER THE *");
						int n=sc.nextInt();
						for (int i=0;i< n;i++) {
							for(int j=i;j<n;j++) {
								System.out.print("_ ");
						}
							for(int j=i; j<n; j++) {
								System.out.print("# ");
							}
							System.out.println();
							}
					}


		}
