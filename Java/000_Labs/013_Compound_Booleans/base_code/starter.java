/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Please enter your first number:");
		 int num1 = sc.nextInt();
		 System.out.print("Please enter your second number:");
		 int num2 = sc.nextInt();
		 System.out.print("Please enter your thrid number:");
		 int num3 = sc.nextInt();
		 if((num1>num2)&&(num1>num3)){
			System.out.println("Your first number is the largest");
		 }
		 if((num2>num1)&&(num2>num3)){
			System.out.println("Your second number is the largest");
		 }
		 if((num3>num2)&&(num3>num1)){
			System.out.println("Your third number is the largest");
		 }

		 
		 if((num1<num2)&&(num1<num3)){
			System.out.println("Your first number is the smallest");
		 }
		 if((num2<num1)&&(num2<num3)){
			System.out.println("Your second number is the smallest");
		 }
		 if((num3<num2)&&(num3<num1)){
			System.out.println("Your third number is the smallest");
		 }


		 




		 



		 


	}
}
