import java.util.Scanner;
public class NumberAboveAverage {

	public static void main(String[] args) {
	double[] temperature=new double[10];//온도 array 지정
	Scanner keyboard= new Scanner(System.in);
	double sum=0.00;//총합
	System.out.println("Type 10 temperatures");//온도 입력
	for (int i=0; i<temperature.length; i++) {//값 10개 받기
		
		temperature[i]=keyboard.nextDouble();//temperature[i]에 값 저장
		sum+=temperature[i];//sum에 값 더하기

	}
	
	double average=sum/temperature.length;//평균 총합/10
	System.out.println("Average is "+average);//출력
		int high=0;
	for(int j=0; j<temperature.length; j++) {

		if(temperature[j]>average) {//반복문 돌면서 평균보다 값 높은 온도 찾기
			high++;
			System.out.println(temperature[j]);//출력
			
			}
		
	}
	System.out.println(high+" is higher than aveage");

	}
}