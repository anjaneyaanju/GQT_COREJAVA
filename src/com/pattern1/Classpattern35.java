package com.pattern1;

import java.util.Scanner;

public class Classpattern35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
     
            for (char ch = (char) ('A' + i); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        }
        
    }
  