package com.pattern1;
import java.util.Scanner;

public class Classpattern33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            ch -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}
