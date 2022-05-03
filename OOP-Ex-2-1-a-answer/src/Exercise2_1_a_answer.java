import java.util.Scanner;

public class Exercise2_1_a_answer {

	public static void main(String[] args) {
		
		
		Scanner keyboard= new Scanner(System.in);
		int n,n1,n2;
		
		System.out.println("Type four nums");
		n=keyboard.nextInt();
		
		n1=n/1000;
		n2=n%1000;//第俊 技磊府
		
		System.out.println(n1);
		
		n1=n2/100;
		n2=n2%100;//第局 滴磊府
		System.out.println(n1);
		
		n1=n2/10;
		n2=n2%10;//第局 茄磊府
		System.out.println(n1);
		System.out.println(n2);
		
		
		
	} 
}
