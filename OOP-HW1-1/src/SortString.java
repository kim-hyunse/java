<<<<<<< HEAD
import java.util.Scanner;//scanner Ŭ���� ����
import java.util.Arrays;//array Ŭ���� ����

public class SortString {//string�� �����ϴ� class 

	public static void main(String[] args) {
		
		String[] strings=new String[3];//string ������ array�� ����
		
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Type Three Strings");//������ string �Է��ϱ�
		
		strings[0]=keyboard.next();
		strings[1]=keyboard.next();
		strings[2]=keyboard.next();
		
		
		strings[0].toLowerCase();
		strings[1].toLowerCase();
		strings[2].toLowerCase();//��ҹ��� �������ֱ�
		
		
		Arrays.sort(strings);//class array�� ���Ե� sort �̿��Ͽ� �����ϱ�
		
		System.out.println("Second String is "+strings[1]);//�ι�° string ���
		
	}
	
}
=======
import java.util.Scanner;//scanner Ŭ���� ����
import java.util.Arrays;//array Ŭ���� ����

public class SortString {//string�� �����ϴ� class 

	public static void main(String[] args) {
		
		String[] strings=new String[3];//string ������ array�� ����
		
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Type Three Strings");//������ string �Է��ϱ�
		
		strings[0]=keyboard.next();
		strings[1]=keyboard.next();
		strings[2]=keyboard.next();
		
		
		strings[0].toLowerCase();
		strings[1].toLowerCase();
		strings[2].toLowerCase();//��ҹ��� �������ֱ�
		
		
		Arrays.sort(strings);//class array�� ���Ե� sort �̿��Ͽ� �����ϱ�
		
		System.out.println("Second String is "+strings[1]);//�ι�° string ���
		
	}
	
}
>>>>>>> f17c570ef85c802e56d119fd2989f27ec02129a1
