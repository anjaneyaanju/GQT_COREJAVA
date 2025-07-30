/**# # # # # #
 * # - - - - #
 * # - - - - #
 * # - - - - #
 * # # # # # #
 * 
 */
package com.pattern1;

/**@author Veeresh
 * @category patterns
 * @description this is an example for conditional pattern
 * 
 * # 
 * # # 
 * # - # 
 * # - - # 
 * # # # # # 

 */
import java.util.Scanner;
public class Classpattern40 {

	/**
	 * 
	 * @param args
	 * @desciption this conatins source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1||j==0||j==n-1)
				System.out.print("# ");
				else {
					System.out.print("- ");
				}
				}
	
		}
		System.out.println();

	}

}
