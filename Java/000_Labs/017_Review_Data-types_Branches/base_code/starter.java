/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
		String text1 = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String text2 = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String text3 = sc.nextLine();

		if(text3.equals("Wizard")){

		System.out.println("You have chosen the Wizard! Excelsior!");

		}
		else if(text3.equals("wizard")){

		System.out.println("You have chosen the Wizard! Excelsior!");
		}

		else if(text3.equals("Warrior")){

		System.out.println("You have chosen the Warrior! For honor!");
		}
		else if(text3.equals("warrior")){

		System.out.println("You have chosen the Warrior! For honor!");
		}
		else if(text3.equals("Rogue")){

		System.out.println("You have chosen the Rogue! How cunning!");
		}
		else if(text3.equals("rogue")){

		System.out.println("You have chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You have decided not to chose a role. Rerun program");
		}

		System.out.println("");

		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma");

		System.out.println("");

		System.out.print("Strength(1-10):" );
		int num1 = sc.nextInt();
		if(num1>10){

				System.out.print("Please input a smaller value. Strength (1-10):");
				num1 = sc.nextInt();
		}
		
		System.out.print("You have ");
		System.out.print( 20 - num1 );
		System.out.print(" ");
		System.out.println("left to spend");
		System.out.println("");
		int num2;
		num2=20-num1;
		if(num2<0){
			System.out.print("You dont have enough points type in a smaller stat.Strength (1-10):");
			num1 = sc.nextInt();
		}

		System.out.print("You have ");
		System.out.print( 20 - num1 );
		System.out.print(" ");
		System.out.println("left to spend");
		System.out.println("");
		
		num2=20-num1;

		
		System.out.print("Dexterity (1-10):" );
		int num3 = sc.nextInt();
		if(num3>10){

				System.out.print("Please input a smaller value. Dexterity (1-10):");
				num3 = sc.nextInt();
		}
		System.out.print("You have ");
		System.out.print( num2 - num3 );
		System.out.print(" ");
		System.out.println("left to spend");
		System.out.println("");

		int num4;
		num4= num2 - num3;
		if(num4<0){
			System.out.print("You dont have enough points type in a smaller stat.Dexterity (1-10):");
			num3 = sc.nextInt();
		}

		System.out.print("You have ");
		System.out.print( num2 - num3);
		System.out.print(" ");
		System.out.println("left to spend");
		System.out.println("");
		
		num4=num2-num3;


		
		System.out.print("Intelligence (1-10):" );
		int num5 = sc.nextInt();
		if(num5>10){

				System.out.print("Please input a smaller value. Intelligence (1-10):");
				num5 = sc.nextInt();
		}
		System.out.print("You have ");
		System.out.print( num4 - num5 );
		System.out.print(" ");
		System.out.println("left to spend");
		System.out.println("");


		int num6;
		num6= num4 - num5;
		if(num6<0){
			System.out.print("You dont have enough points type in a smaller stat.Inteligence (1-10):");
			num5 = sc.nextInt();
		}

		System.out.print("You have ");
		System.out.print( num4 - num5);
		System.out.print(" ");
		System.out.println("left to spend");
		System.out.println("");
		
		num6= num4 - num5;


		System.out.print("Charisma (1-10):" );
		int num7 = sc.nextInt();
		if(num7>10){

				System.out.print("Please input a smaller value. Charisma (1-10):");
				num7 = sc.nextInt();
		}
		

		int num8;
		num8= num6 - num7;

		if(num8<0){
			System.out.print("You dont have enough points type in a smaller stat.Charisma (1-10):");
			num7 = sc.nextInt();
		}

		
		
		num8= num6 - num7;

		if(num8>0){
			System.out.print("You have ");	
			System.out.print(num8);
			System.out.print(" ");
			System.out.println("to spend for next time.");
		}

		System.out.println("---------------------------------------------");
		System.out.print("You are ");
		
		System.out.print(text1);
		
		System.out.print(",");
		
		System.out.print(" the ");
		
		System.out.print(text2);
		
		System.out.print(" ");
		
		System.out.println("of CVHS.");
		
		System.out.print("You are a " );
		
		System.out.print(text3);
		
		System.out.print(" ");
		
		System.out.println("with the following stats!");

		System.out.print("Strength - ");
		System.out.println(num1);

		System.out.print("Dexterity - ");
		System.out.println(num3);

		System.out.print("Intelligence - ");
		System.out.println(num5);

		System.out.print("Charisma - ");
		System.out.println(num7);
		
		System.out.println("");

		System.out.print("Good luck on your quest ");
		System.out.print(text1);
		System.out.print(" !");











		
		









	}
}
