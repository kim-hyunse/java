import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		
		double[] temperature= new double[7];
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Type 7 tempers");
		double sum=0.00;
		for(int index=0; index<7; index++) {
			
			temperature[index]=keyboard.nextDouble();
			sum=sum+temperature[index];
			
			
		}
		double average=sum/7;
		System.out.println("The avrage temperature is"+average);
		System.out.println("The temperatures are");
		for (int index=0; index<7; index++) {

			System.out.println(temperature[index]);
		
	}
		System.out.println("Have a nice week");
		keyboard.close();
	}
}
