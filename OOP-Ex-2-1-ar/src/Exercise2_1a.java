import java.util.Scanner;

public class Exercise2_1a {
	
	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Type four nums");
		int fourNum=keyboard.nextInt();
		int first=fourNum/1000;
		int second=(fourNum-first*1000)/100;
		int third=(fourNum-first*1000-second*100)/10;
		int fourth=fourNum%10;
				
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		
		
	}

}
