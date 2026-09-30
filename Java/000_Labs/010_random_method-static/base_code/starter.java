/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("A number between 0 - 9:");
		int num1 = (int)(Math.random() * 10 - 0 ); 
		System.out.println(num1);
		System.out.print("A number between 1 - 100:");
		int num2 = (int)(Math.random() * 101 + 0 );
		System.out.println(num2);
		System.out.print("A number between 2.5 and 3.5:");
		double num3 = (double)(Math.random() * 1 + 2.4 );
		System.out.println(num3);
		System.out.print("A number between 14 and 589:");
		int num4 = (int)(Math.random() * 575 + 13 );
		System.out.println(num4);


	}
}
