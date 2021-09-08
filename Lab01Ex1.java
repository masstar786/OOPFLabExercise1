
//OOPF Lab 1 : Exercise 1 - Masuma S
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		// Initialise user input
		Scanner input = new Scanner(System.in);

		// assigning variables
		int num1, num2, num3;
		int sum, product, smallest, largest;
		float average;

		// Taking user input
		System.out.println("Enter your first number: ");
		num1 = input.nextInt();
		System.out.println("Enter your second number: ");
		num2 = input.nextInt();
		System.out.println("Enter your third number: ");
		num3 = input.nextInt();

		// Assigning formulas
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		// castings - for more precise numbers.
		average = (float) sum / 3;

		// Finding the smallest number;
		// Using IF statement
		smallest = num1;
		if (num2 < smallest) {
			num2 = smallest;
		}
		if (num3 < smallest) {
			num3 = smallest;
		}

		// Finding the largest number;
		// Using IF statement
		largest = num1;
		if (num2 > largest) {
			num2 = largest;
		}
		if (num3 > largest) {
			num3 = largest;
		}

		// Output of values to the users
		System.out.println("The sum is " + sum);
		System.out.println("The products is " + product);
		System.out.printf("The average is %.2f\n", average);
		System.out.println("The smallest number is " + smallest);
		System.out.println("The largest number is " + largest);

	}

}
