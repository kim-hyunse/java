import java.util.Scanner;
public class TypeCasting {
	public static void main(String[] args) {
	Scanner keyboard= new Scanner(System.in);
	
	double x=keyboard.nextDouble();
	int y=(int)x;
	
	System.out.println(x);
	System.out.println(y);

	byte z=(byte)x;
	
	System.out.println(x);
	System.out.println(z);
	
	keyboard.close();
	
	
	}
	

}
