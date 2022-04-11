import java.util.Scanner;
public class ForDemo {
	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);
		
		int counting=keyboard.nextInt();
		for(int i=counting; i>=0; i--) {
			
			System.out.println(i);
			System.out.println("and counting");
			
				
			
		}
		System.out.println("Blast off!");
		keyboard.close();
	}
}
