import java.util.Scanner;
public class BooleanDemo {
	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter non-negative numbers");
		System.out.println("Place a negative number at the end to serve as an end marker");
		int num=keyboard.nextInt();
		int sum=0;
		while(num>=0){
			
			sum+=num;
			 num=keyboard.nextInt();
			 
			 if(num<0) {
				 System.out.println("The sum of the number is "+sum);
				 break;
				 
				 
			 }
			
		}
		
		
		
	}

}
