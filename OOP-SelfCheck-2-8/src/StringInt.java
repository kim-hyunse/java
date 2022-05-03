import java.util.Scanner;
public class StringInt {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a string.");
	int n = keyboard.nextInt();
	String s = keyboard.next();
	System.out.println("n is " + n);
	System.out.println("s is " + s);
	keyboard.close();
	
	//숫자 하나 넣고 문자열 넣으면 숫자는 잘 출력되고 문자열은 띄어쓰기 전까지 출력됨
	//2istheinput을 input으로 넣으면 에러발생.. 당연함 nextInt로 숫자만 받을 수 잇는데 문자까지 들어옴
	}
}
