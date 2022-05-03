import java.util.Scanner;
public class ExamAverager {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
	
	
		String answer;
		do {
		System.out.println("Want to average another exam?");
		System.out.println("Enter yes or no");
	    answer=keyboard.next();
		System.out.println("Enter all the scores to be averaged");
		System.out.println("Enter a negative number after you have entered all the scores");

		int sum=0;
		int i=0;
		int score=keyboard.nextInt();
		while(score>0) {
              
			sum+=score;
			i++;
			score=keyboard.nextInt();//!!!!!
		}
		
		double average=sum/i;
	    System.out.println("The average is "+average);
		
		
		}while(answer.equals("yes"));
		
		
	}
}
