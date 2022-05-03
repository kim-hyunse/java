import java.util.Scanner;

public class Keyboard {
	public static void main(String[] args) {

		
		
		  System.out.println("Enter two numbers");
		  System.out.println("separated by one or more spaces");
		 
		  Scanner keyboard=new Scanner(System.in); 
			
			  int n1=keyboard.nextInt(); int n2=keyboard.nextInt();
			  System.out.println("You entered "+n1+" and "+n2);
			  System.out.println("Next enter two numbers");
			  System.out.println("Decimal point is OK"); float f1=keyboard.nextFloat();
			  float f2=keyboard.nextFloat();
			  System.out.println("You entered "+f1+" and "+f2);
			  System.out.println("Next enter two words"); String s1=keyboard.next(); String
			  s2=keyboard.next();
			  System.out.println("You entered \""+s1+"\" and \""+s2+"\"");
			  s1=keyboard.nextLine(); System.out.println("Next enter a line of text:");
			  s1=keyboard.nextLine(); System.out.println("You entered \""+s1+"\"");
			 
		int n;
		String str1, str2;
		n = keyboard.nextInt();
		str1 = keyboard.nextLine();
		str2 = keyboard.nextLine();
		System.out.println(n);
		System.out.println(str1);
		System.out.println(str2);
		keyboard.close();
		

	}

}
