import java.util.Scanner;
public class Grader {

	public static void main(String[ ] args) {

		Scanner keyboard= new Scanner(System.in);
		
		
		System.out.println("Enter your score:");
		int grade=keyboard.nextInt();
		
		if(grade>=90) {
			System.out.println("score: "+grade);
			System.out.println("grade: A");
		}
		else if(grade>=80&&grade<90) {
			System.out.println("score: "+grade);
			System.out.println("grade: B");
		}
		else if(grade>=70&&grade<80) {
			System.out.println("score: "+grade);
			System.out.println("grade: C");
		}
		else if(grade>=60&&grade<70) {
			System.out.println("score: "+grade);
			System.out.println("grade: D");
		}
		else {
			System.out.println("score: "+grade);
			System.out.println("grade: F");
		}

		
		
		
	}
}
