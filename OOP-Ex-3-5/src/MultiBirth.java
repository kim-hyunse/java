import java.util.Scanner;
public class MultiBirth {

	public static void main(String[] args) {
		
		System.out.println("Enter number of babies");
		Scanner keyboard=new Scanner(System.in);
		int baby=keyboard.nextInt();
		
		switch (baby) {
		case 1:
			System.out.println("Congratulations");
			break;
		case 2:
			System.out.println("wow.twins");
			break;
		case 3:
			System.out.println("Wow. triplets");
			break;
		case 4:
			System.out.println("Unbelievable.4 babaies");
			break;
		case 5:
			System.out.println("5 babies");
			break;
		default:
			System.out.println("I don't believe you");
			break;
			
		
		}
		keyboard.close();
		
	}
}
