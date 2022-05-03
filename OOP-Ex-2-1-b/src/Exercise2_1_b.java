import java.util.Scanner;

public class Exercise2_1_b {

	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("Type degree in Fahrenheit");
	float Fahrenheit=keyboard.nextFloat();
	
	float Celcius = 5*(Fahrenheit - 32) / 9;
	
	System.out.println("Fahrenheit: "+Fahrenheit+" is "+Celcius+" in Celcius");

	}
	}
