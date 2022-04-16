import java.util.Scanner;
public class Proportion {

	public static void main(String[] args) {
	Scanner keyboard= new Scanner(System.in);
	int sum=0;
	System.out.println("How many numbers will you enter?");//array 개수 지정
	int index=keyboard.nextInt();
	int[] arr= new int[index];//array 선언
	System.out.println("Enter "+index+" integers, one per line");
	for(int i=0; i<arr.length; i++) {
	
		arr[i]=keyboard.nextInt();//array에 값 지정
		sum+=arr[i];//array총합 구하기
	
	}
	System.out.println("The sum is "+sum);//총합
	System.out.println("The numbers are:");
	for(int j=0; j<arr.length; j++) {
	System.out.println(arr[j]+" which is "+arr[j]/(double)sum*100+"% of the sum");	
	//각 array의 값과 퍼센티지
	
	}
	keyboard.close();
	}
	
}
