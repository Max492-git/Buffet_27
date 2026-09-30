/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number:");
		int num1 = sc.nextInt();
		System.out.println("");
		System.out.print("Please input your second number:");
		int num2 = sc.nextInt();
		boolean x = num1 == num2;
		if(x){
			System.out.print("Your numbers are the same!");
		}
		boolean y = num1 != num2;
		if(y){
			System.out.print("Your numbers are different!");
		}





	}
}
