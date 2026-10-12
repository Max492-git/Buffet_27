/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Ascii Mueseum.");
		System.out.println("Please select what exhibit you'd like to view.");
		System.out.println("1.Vehicles");
		System.out.println("2.Sports");
		System.out.println("3.Buildings");
		String text1 = sc.nextLine();
		
		if(text1.equals("Vehicles")){

			System.out.println("--Vehicles--");
			System.out.println("1.car");
			System.out.println("2.boat");
			System.out.print("Which piece?");
			String text2 = sc.nextLine();
			if(text2.equals("boat")){
				System.out.println("        _    _");
				System.out.println("     __|_|__|_|__");
				System.out.println("   _|____________|__");
				System.out.println("  |o o o o o o o o /");
				System.out.println(" ~'`~'`~'`~'`~'`~'`~'`~");

			}
			
			if(text2.equals("car")){

				System.out.println("             ______--------___");
				System.out.println("             /|             / |");
				System.out.println("  o___________|____________/__|");
				System.out.println(" ]|___     |  |=   ||  =|___  |");
				System.out.println(" //   //    |  |____||_///    |");
				System.out.println("  |  X  |--------------/|  X  |");
				System.out.println("    ___/                  ___/");
				

	
			
			
			}
		}
		
		else if(text1.equals("Sports")){
			System.out.println("--Sports--");
			System.out.println("1.bowling");
			System.out.println("2.football");
			System.out.print("Which piece?");
			String text3 = sc.nextLine();	
		

			if(text3.equals("bowling")){
				System.out.println("      .-.");
				System.out.println("   .-.| /    .-.");
				System.out.println("   | /|=|    | /");
				System.out.println("   |=|  |    |=|");
				System.out.println("  /   | ---./   |");
				System.out.println("  |   / ..  |   |");
				System.out.println("  |  |#  '   |  |");
				System.out.println("  '._ |     /_.'");
				System.out.println("       '---'");

	
	
				
			}

			if(text3.equals("football")){
				System.out.println("    _.-=  =-._ ");
				System.out.println("  .'||-++++-//'.");
				System.out.println(" (  ||      ||  )");
				System.out.println("  './/      ||.'");
				System.out.println("    `'-=..=-'`");

		}

		}
		else if(text1.equals("Buildings")){
		System.out.println("--Buildings--");
			System.out.println("1.house");
			System.out.println("2.castle");
			System.out.print("Which piece?");
			String text4 = sc.nextLine();

			if(text4.equals("house")){
				System.out.println("     _|=|__________");
				System.out.println("    /              |");
				System.out.println("   /                |");
				System.out.println("  /__________________|");
				System.out.println("   ||  || /--| ||  ||");
				System.out.println("   ||  || | .| ||  ||");
				System.out.println("   ||__||_|__|_||__||");
				System.out.println("   |-|-|-|====|-|-|-| ");
				System.out.println("^^^^^^^^^^====^^^^^^^^^^^");

			}
			if(text4.equals("castle")){
				System.out.println(" _   |~  _");
				System.out.println("[_]--'--[_]");
				System.out.println("|'|  `  |'|");
				System.out.println("| | /^  | |");
				System.out.println("|_|_|I|_|_|");
				
			




			}

		
		
		
		
		
		
		
		
		
		}
		
		
		
		else{

			System.out.println("Next time please pick a exhibit");
		
		}

		

		


	




		
	
}
}
