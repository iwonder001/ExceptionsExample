import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// take value of user input, divide it and give back a result
		Scanner input = new Scanner(System.in);
		String userCont; // Variable to allow the user to continue the program
							// (handle the loop)
		boolean cont = true; // Variable to control while loop and initialize
								// variable to true
		int number; // holds/stores the user input number
		int number2;// 2nd number to store the user input 

		while (cont) {
			// Ask for user input of a number
			System.out.println("Enter a number: ");
			number = input.nextInt();
			System.out.println("Enter a another number: ");
			number2 = input.nextInt();
			//put in a validation to make user put in number great than zero and ask them to enter another number
			while(number2<=0){
				System.out.println("That is improper input.  Enter a number greater than zero. ");
				System.out.println("Enter a another number: ");
				number2 = input.nextInt();
			}
			// Try/catch Exception code goes here
			input.nextLine();
			try {
				// Display that number divided by 10
				System.out.println(number / number2);

			} catch (ArithmeticException e) {
				System.out.println("You cannot divide by 0");
			}

			// Ask if user want to continue
			System.out.println("Continue? (y/n)");
			userCont = input.nextLine();
			// If the user says yes cont = true
			// Else cont = false
			if (userCont.equalsIgnoreCase("y")) {
				cont = true;

			} else {
				cont = false;

			} // if/else statement

		} // close while loop for continuing
		System.out.println("Bye!"); // exit statement out side of the while loop

	}// psvm

}
