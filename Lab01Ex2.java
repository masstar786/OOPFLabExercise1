
//OOPF Lab 1 : Ex 2 - Masuma S
import java.util.Scanner;

public class Seperator {

	public static void main(String[] args) {

		// declaring the variables
		int number;
		int num1, num2, num3, num4, num5;
		Scanner input = new Scanner(System.in);

		// Asking the user for a 5 digit number
		System.out.println("Enter your 5 digit number: ");
		number = input.nextInt();

		// The formula in order to separate the digits
		num1 = number / 10000;
		num2 = (number % 10000) / 1000;
		num3 = (number % 1000) / 100;
		num4 = (number % 100) / 10;
		num5 = (number % 10) / 1; // also, number % 10

		System.out.println("Your numbers are: ");
		System.out.println("Your first digit is: " + num1);
		System.out.println("Your first digit is: " + num2);
		System.out.println("Your first digit is: " + num3);
		System.out.println("Your first digit is: " + num4);
		System.out.println("Your first digit is: " + num5);

		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);

	}

}
