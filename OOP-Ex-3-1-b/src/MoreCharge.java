import java.util.Scanner;
public class MoreCharge {
	
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Type cost");
		double cost=keyboard.nextDouble();
		double charge = 0;


		if(cost<0.25||cost%5!=0||cost>1) {
			
		System.out.println("Error");
		System.exit(0);
			
		}
		else {
			
		if(cost<10) {
			
			charge=1;
			
		}
		else if(cost<100) {
			
			charge=cost*0.1;
		}
		else if(cost<1000) {
			
			charge=5+cost*0.05;
		}
		else {
			
			charge=40+cost*0.01;
		}
		
		System.out.println(charge);	
			
			
		}
		
		
		keyboard.close();
	}

	
}
