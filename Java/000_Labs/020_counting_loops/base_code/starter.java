/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name:");
		String text1 = sc.nextLine();
		
		System.out.println("");
		System.out.print("Please enter how many times you'd like to print your name:");
		int num1 = sc.nextInt();
		int num2 = 0;
		while(true){
			if (num2==num1){
				break;
			}
			System.out.println(text1);

			num2++;

		}
		






		
	}
}
