
import java.util.Scanner;

public class EggBasket2 {

	public static void main(String[] args) {
		int numberOFBaskets, eggsPerBasket, totalEggs;
		
		//numberOFBaskets=10;
		//eggsPerBasket=6;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of eggs in each basket");
		numberOFBaskets=keyboard.nextInt();
		
		System.out.println("Enter the number of eggs Per Basket");
		eggsPerBasket=keyboard.nextInt();
		
		totalEggs=numberOFBaskets*eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket+" eggs Per Basket and");
		System.out.println(numberOFBaskets+ " Baskets, then");
		System.out.println("the total number of Eggs is " +totalEggs);
		
		
		
		

	}

}
