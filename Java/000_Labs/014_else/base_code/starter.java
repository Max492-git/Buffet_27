/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Pick a number between 1 - 1000:");
		int num1 = sc.nextInt();
		int num2 = (int)(Math.random() * 1000 );
		if(num1 == num2){
			System.out.print("Your number was the random number");
		}
		else{ 
			 System.out.print("Your number wasn't the random number. ");
			}
			System.out.print("The number was ");
			System.out.print(num2);

		 
		
		

	}
}
