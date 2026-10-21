/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num2 = (int)(Math.random() * 1000 );
		System.out.println("Welcome to the guessing game!");
		System.out.print("Please guess a number:");
		int num1 = sc.nextInt();
		
		while(true){
			
			if (num1==num2){
					System.out.println("You got the number!");
					break;
			}
			else if (num1>num2){
					System.out.println("The number is lower");
					System.out.print("Please guess a number:");
					 num1 = sc.nextInt();
				
			}
			else if (num1<num2){
					System.out.println("The number is higher");
					System.out.print("Please guess a number:");
					 num1 = sc.nextInt();
			}


		}



		
	}
}
