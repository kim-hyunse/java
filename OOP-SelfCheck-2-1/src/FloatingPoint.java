import java.util.Scanner;

public class FloatingPoint {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		double x;
		
		x=keyboard.nextFloat();
		double y=1.0/x;
		double z=x*y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(1-z);
		keyboard.close();
		
		
		
		
	}
}
