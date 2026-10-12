/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
		String text1  = sc.nextLine();
		if(text1.equals("Wizard")){
			System.out.print("You have chosen the Wizard! Excelsior!");

	}
	
	else if(text1.equals("Warrior")){

	System.out.print("You have chosen the Warrior! For honor!");
	
	
	}

	else if(text1.equals("Rogue")){

	System.out.print("You have chosen the Rogue! How cunning!");
	
	
	}
	else{
		System.out.print("You have decided not to chose a role. Rerun program");
	}
	
	
	
	
	}
}
