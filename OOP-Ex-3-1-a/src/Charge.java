import java.util.Scanner;
public class Charge {
	
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Type charge");
		double charge=keyboard.nextInt();


		if(charge<10) {
			
			charge=1;
			
		}
		else if(charge<100) {
			
			charge=charge*0.1;
		}
		else if(charge<1000) {
			
			charge=5+charge*0.05;
		}
		else {
			
			charge=40+charge*0.01;
		}
		
		System.out.println(charge);
		
		keyboard.close();
	}

	
}
