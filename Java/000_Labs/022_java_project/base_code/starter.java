/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int balance = 100;
		
		System.out.println("Slot Machine Rules:");
		System.out.print("1.");
		System.out.print(" ");
		System.out.println("Each player starts with $100.");
		System.out.print("2.");
		System.out.print(" ");
		System.out.println("Input a wager less than your total amount of money.");
		System.out.print("3.");
		System.out.print(" ");
		System.out.println("The slot machine will roll 3 numbers from 1 to 10.");
		System.out.print("a.");
		System.out.print(" ");
		System.out.println("If two numbers match, you double your money.");
		System.out.print("b.");
		System.out.print(" ");
		System.out.println("If three numbers match, you triple your money.");
		System.out.print("c.");
		System.out.print(" ");
		System.out.println("If none match, you lose your money.");
		System.out.println("-----------------------------------------------------");
		System.out.println("");

		boolean valid = false;
		boolean keeplaying = true;

		while (!valid){
			System.out.print("Do you want to play the game? (Yes/yes/Y/y or No/no/N/n):");
			String input = sc.next();
			if (input.equals("Yes") || input.equals("yes") || input.equals("Y") || input.equals("y")){
				keeplaying = true;
				valid = true;

			}
			else if (input.equals("No") || input.equals("no") || input.equals("N") || input.equals("n") ){
				keeplaying = false;
				valid = true;
			}
			else {
				System.out.println("Invalid input. Please enter Yes,yes,Y,y, No, no, N, n.");
			}


		

		if(!keeplaying){
			System.out.println("Game ended by user you have $" + balance + "left.");
			break;
		}
		

		while (balance > 0){
			System.out.println("You have $ "+ balance + "dollars");
			System.out.print("Enter your wager amount:");
			int wager = sc.nextInt();
			
			if (wager <= 0){
				System.out.println("Wager must be greater than 0.");
				continue;
			}
			if (wager > balance){
				System.out.println("You dont have enough money for that wager!");
				continue;
			}

			int num1 = random.nextInt(9) +1;
			int num2 = random.nextInt(9) +1;
			int num3 = random.nextInt(9) +1;

			System.out.println("Rolling...");
			System.out.println("Result: ["+ num1 +"]["+ num2 +"]["+ num3 +"]");

			if (num1 == num2 && num2 == num3){
				int winnings = wager * 3;
				balance += winnings;
				System.out.println("Jackpot Three numbers are the same, you tripled your wager and won $"+ winnings +"!");


			}
			else if (num1 == num2 || num2 == num3 || num1 == num3){
				int winnings = wager * 2;
				balance += winnings;
				System.out.println("Two numbers are the same, it doubles your money wagered! You won $" + winnings +"!");

			}
			else {
				balance -= wager;
				System.out.println("None are the same, you lose the money ($" + wager + ").");

			}
			if (balance <= 0){
				System.out.println("You have run out of money. The game ends");
				break;
			}


		}
		}
		

		

	}
}
