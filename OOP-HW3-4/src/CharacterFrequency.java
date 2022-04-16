import java.util.Scanner;
public class CharacterFrequency {
	
	public static void main(String[] args) {
		
	String telNum= new String();//전화번호 입력받을 문자열 지정
	
	
	Scanner keyboard=new Scanner(System.in);
	telNum=keyboard.nextLine();//번호 string으로 입력받기

	int[] number=new int[10];
	
	for(int i=0; i<number.length; i++) {
		char num=telNum.charAt(i);//String에 입력한 값 char에 각각 저장
		number[(int)num-48]++;//array에 0번부터 9까지 들어오는 값 저장
		
	}

    for(int j=0; j<number.length; j++) {
        System.out.println(j + ":" + number[j]);//숫자 갯수
    }
	
	
	keyboard.close();
	}

}
