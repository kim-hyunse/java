import java.util.Scanner;
public class CharacterFrequency {
	static String fullNum="";//show full number
	public static void main(String[] args) {
	String[] telNum= new String[10];//전화번호 입력받을 배열 지정
	int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;//몇이 들어왔는 지 세기
	Scanner keyboard=new Scanner(System.in);
	for(int i=0; i<telNum.length; i++) {//0~9까지
		
		telNum[i]=keyboard.next();//번호 string으로 입력받기
		int phoneNum=Integer.parseInt(telNum[i]);//번호 정수로 바꿔주기
		switch(phoneNum) {//정수로 바꾼 변호 case 세주기
		case 0://0 입력 받았을 때
			zero++;
			break;
		case 1://1 입력 받았을 때
			one++;
			break;
		case 2://2 입력 받았을 때
			two++;
			break;
		case 3://3 입력 받았을 때
			three++;
			break;
		case 4://4 입력 받았을 때
			four++;
			break;
		case 5://5입력 받았을 때
			five++;
			break;
		case 6://6 입력 받았을 때
			six++;
			break;
		case 7://7 입력 받았을 때
			seven++;
			break;
		case 8://8 입력 받았을 때
			eight++;
			break;
		case 9://9 입력 받았을 때
			nine++;
			break;
				
		}
		fullNum+=telNum[i];//번호 총 나열했을 때
	}


	System.out.println("full number is "+fullNum);//나열한 수
	System.out.println("num 0: "+zero);//0 갯수
	System.out.println("num 1: "+one);//1 갯수
	System.out.println("num 2: "+two);//2 갯수
	System.out.println("num 3: "+three);//3 갯수
	System.out.println("num 4: "+four);//4 갯수
	System.out.println("num 5: "+five);//5 갯수
	System.out.println("num 6: "+six);//6 갯수
	System.out.println("num 7: "+seven);//7 갯수
	System.out.println("num 8: "+eight);//8 갯수
	System.out.println("num 9: "+nine);//9 갯수

	
	
	keyboard.close();
	}

}
