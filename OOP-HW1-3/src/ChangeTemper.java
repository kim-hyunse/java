import java.util.Scanner;//scanner 클래스 삽입

public class ChangeTemper {//온도 단위 변환
	
	public static void main(String[] args) {
		
	Scanner keyboard= new Scanner(System.in);
	double temperature;
	System.out.println("Type temperature");// 온도 입력하기
	temperature=keyboard.nextDouble();
	System.out.println("Type unit");//단위 입력하기
	char degreeUnit;
	degreeUnit=keyboard.next().charAt(0);//string으로 입력받은 단위의 첫글자(char) 저장
	
	if(degreeUnit=='C'||degreeUnit=='c') {//섭씨일 경우
	
	double Degrees_F =  (9*temperature / 5) + 32  ;//화씨로 변환
	System.out.println("Celsius "+temperature+" is "+Degrees_F+" in Fahrenheit");
	}
	
	else if(degreeUnit=='F'||degreeUnit=='f') {//화씨일 경우
		
	
	double Degrees_C = 5*(temperature - 32) / 9 ;//섭씨로 변환
	System.out.println("Fahrenheit "+temperature+" is "+Degrees_C+" in Celsius");
	
	}
	
	else {
		
	System.out.println("error : wrong character");//단위 틀렸을 경우 에러 출력 및 탈출
	System.exit(0);
	
	
	}
	}
}
