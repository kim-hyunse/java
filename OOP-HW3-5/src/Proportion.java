import java.util.Scanner;
public class Proportion {

	public static void main(String[] args) {
	Scanner keyboard= new Scanner(System.in);
	int sum=0;
	System.out.println("How many numbers will you enter?");//array ���� ����
	int index=keyboard.nextInt();
	int[] arr= new int[index];//array ����
	System.out.println("Enter "+index+" integers, one per line");
	for(int i=0; i<arr.length; i++) {
	
		arr[i]=keyboard.nextInt();//array�� �� ����
		sum+=arr[i];//array���� ���ϱ�
	
	}
	System.out.println("The sum is "+sum);//����
	System.out.println("The numbers are:");
	for(int j=0; j<arr.length; j++) {
	System.out.println(arr[j]+" which is "+arr[j]/(double)sum*100+"% of the sum");	
	//�� array�� ���� �ۼ�Ƽ��
	
	}
	keyboard.close();
	}
	
}
