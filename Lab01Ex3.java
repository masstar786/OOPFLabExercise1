//OOPF Lab 1 : Ex 3 - Masuma S

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {

		int number;
		// initializing user input
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your number, and I will tell you if it's Even or Odd: ");
		number = input.nextInt();

		// Using IF conditions
		if (number % 2 == 0) {
			System.out.println("Your number is Even!");
		} else {
			System.out.println("Your number is Odd!");
		}

	}

}
