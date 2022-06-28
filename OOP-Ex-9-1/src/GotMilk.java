import java.util.Scanner;

public class GotMilk {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		try {
			System.out.println("Enter number of donuts");
			int donut = keyboard.nextInt();
			System.out.println("Enter number of glasses of milk");
			int milk = keyboard.nextInt();
			if (milk < 1) {

				throw new Exception("Exception: no milk!");

			}

			double donutsPerGlasses = donut / (double) milk;

			System.out.println(donut + " donuts");
			System.out.println(milk + " glasses of milk");
			System.out.println("You have " + donutsPerGlasses + " donuts for each glasse of milk");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Go buy some milk");
		}
		System.out.println("End of program");
	}
}
