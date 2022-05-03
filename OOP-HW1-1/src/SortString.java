<<<<<<< HEAD
import java.util.Scanner;//scanner 클래스 삽입
import java.util.Arrays;//array 클래스 삽입

public class SortString {//string을 정렬하는 class 

	public static void main(String[] args) {
		
		String[] strings=new String[3];//string 세개를 array로 선언
		
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Type Three Strings");//세개의 string 입력하기
		
		strings[0]=keyboard.next();
		strings[1]=keyboard.next();
		strings[2]=keyboard.next();
		
		
		strings[0].toLowerCase();
		strings[1].toLowerCase();
		strings[2].toLowerCase();//대소문자 통일해주기
		
		
		Arrays.sort(strings);//class array에 포함된 sort 이용하여 정렬하기
		
		System.out.println("Second String is "+strings[1]);//두번째 string 출력
		
	}
	
}
=======
import java.util.Scanner;//scanner 클래스 삽입
import java.util.Arrays;//array 클래스 삽입

public class SortString {//string을 정렬하는 class 

	public static void main(String[] args) {
		
		String[] strings=new String[3];//string 세개를 array로 선언
		
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Type Three Strings");//세개의 string 입력하기
		
		strings[0]=keyboard.next();
		strings[1]=keyboard.next();
		strings[2]=keyboard.next();
		
		
		strings[0].toLowerCase();
		strings[1].toLowerCase();
		strings[2].toLowerCase();//대소문자 통일해주기
		
		
		Arrays.sort(strings);//class array에 포함된 sort 이용하여 정렬하기
		
		System.out.println("Second String is "+strings[1]);//두번째 string 출력
		
	}
	
}
>>>>>>> f17c570ef85c802e56d119fd2989f27ec02129a1
