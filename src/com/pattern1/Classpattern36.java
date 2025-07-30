package com.pattern1;
import java.util.Scanner;
public class Classpattern36 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter num:");
        int n = sc.nextInt();
 for (int i = 0; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
            }
}