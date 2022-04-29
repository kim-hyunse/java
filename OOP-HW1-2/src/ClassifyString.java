import java.util.Scanner;//scanner 클래스 삽입

public class ClassifyString {//string을 구분하여 다른 output을 출력하는 class 

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		String string;
		System.out.print("Type Strings");// string 입력하기
		string=keyboard.next();
		
		char[] lastCharArray = string.toCharArray();//전체 문자열을 Char 배열로 바꾸기

        char lastChar = lastCharArray[lastCharArray.length - 1];//마지막 문자의 배열에 접근하여 마지막 문자를 저장

     
		if(lastChar=='?'){//마지막 문자가 ? 일 경우
			
			int num;
			System.out.print("Type a number");//숫자입력
			num=keyboard.nextInt();
			if(num%2==0) {//짝수일 경우
				System.out.print("Yes");
			}
			else {//홀수일 경우
				System.out.print("No");
			}
			
			
			
		}
		
		else if(lastChar=='!') {//마지막 문자가 ! 일 경우
			
			
			System.out.print("Wow");
			
		}
		else {//아무 경우에도 해당되지 않을 경우
			System.out.print("You always say \""+string+"\"");
			
			
			

			
			
		}
		
		
		
		
		
		
		
		
	}
}
