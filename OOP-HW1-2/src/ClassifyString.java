import java.util.Scanner;//scanner Ŭ���� ����

public class ClassifyString {//string�� �����Ͽ� �ٸ� output�� ����ϴ� class 

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		String string;
		System.out.print("Type Strings");// string �Է��ϱ�
		string=keyboard.next();
		
		char[] lastCharArray = string.toCharArray();//��ü ���ڿ��� Char �迭�� �ٲٱ�

        char lastChar = lastCharArray[lastCharArray.length - 1];//������ ������ �迭�� �����Ͽ� ������ ���ڸ� ����

     
		if(lastChar=='?'){//������ ���ڰ� ? �� ���
			
			int num;
			System.out.print("Type a number");//�����Է�
			num=keyboard.nextInt();
			if(num%2==0) {//¦���� ���
				System.out.print("Yes");
			}
			else {//Ȧ���� ���
				System.out.print("No");
			}
			
			
			
		}
		
		else if(lastChar=='!') {//������ ���ڰ� ! �� ���
			
			
			System.out.print("Wow");
			
		}
		else {//�ƹ� ��쿡�� �ش���� ���� ���
			System.out.print("You always say \""+string+"\"");
			
			
			

			
			
		}
		
		
		
		
		
		
		
		
	}
}
