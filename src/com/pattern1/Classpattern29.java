package com.pattern1;
import java.util.Scanner;

public class Classpattern29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row count (odd number): ");
        int n = sc.nextInt();
        
        int mid = (n + 1) / 2;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == mid + 1 || j - i == mid - 1 || i - j == mid - 1 || i + j == (n + mid)) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
