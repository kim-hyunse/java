import java.util.Scanner;
public class Modulo {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		float x=keyboard.nextFloat();
		
		double y=x%2.0;
		
		System.out.println(x);
		System.out.println(y);
		int z=(int)x;
		System.out.println(x);
		System.out.println(z);
		System.out.println(z%2);

		
		
		
		
		
		
		keyboard.close();

	}
}
/*-5.4
-5.4
-1.4000000953674316
-5.4
-5
-1

4.5
4.5
0.5
4.5
4
0

*/