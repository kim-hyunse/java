import java.util.Scanner;

public class DivideByZeroDemo {
	private int numerator;
	private int denominator;
	private double quotient;

	public static void main(String[] args) {
		DivideByZeroDemo oneTime = new DivideByZeroDemo();
		oneTime.doIt();
	}

	public void doIt() {
		System.out.println("Enter numerator:");
		Scanner keyboard = new Scanner(System.in);
		numerator = keyboard.nextInt();
		System.out.println("Enter denominator:");
		denominator = keyboard.nextInt();
		quotient = numerator / (double) denominator;
		System.out.println(numerator + "/" + denominator + " = " + quotient);
		if (denominator == 0) {
			giveSecondChance();
		}
		System.out.println("End of program.");
	}

// code continues to the next page
	public void giveSecondChance() {
		System.out.println("Try again:");
		System.out.println("Enter numerator:");
		Scanner keyboard = new Scanner(System.in);
		numerator = keyboard.nextInt();
		System.out.println("Enter denominator:");
		System.out.println("Be sure the denominator is not zero.");
		denominator = keyboard.nextInt();
		if (denominator == 0) {
			System.out.println("I cannot do division by zero.");
			System.out.println("Since I cannot do what you want,");
			System.out.println("the program will now end.");
			System.exit(0);
		}
		quotient = ((double) numerator) / denominator;
		System.out.println(numerator + "/" + denominator + " = " + quotient);
	}
}