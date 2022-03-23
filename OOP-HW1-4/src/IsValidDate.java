import java.util.Scanner;//scanner 클래스 삽입
 

public class IsValidDate {//날짜가 유효한 지 확인
	
	public static void main(String[] args) {
	
		Scanner keyboard= new Scanner(System.in);
		String date;
		System.out.println("Type Strings");// string 입력하기 형식 mm/dd/yyyy
		date=keyboard.next();
	
		String year = date.substring(date.length()-4);//뒤 네자리(연도)만 자르기
		int int_year=Integer.parseInt(year);//정수형으로 타입 변환
		
		String month = date.substring(0, 2);//앞 두자리(월)만 자르기
		int int_month=Integer.parseInt(month);//정수형으로 타입 변환
		
		String day = date.substring(3, 5);//일만 자르기
		int int_day=Integer.parseInt(day);//정수형으로 타입 변환
		

			if(int_year%4==0&&int_year%400==0) {//윤달인 경우
				switch(int_month) {
				//달 별 유효한 날짜 지정
				 case 1://1월
					if(int_day>=1&&int_day<=31){
						System.out.println(date+ " is valid date");//유효한 날짜인 경우
						break;
			
					}
					else {
						System.out.println("Error : invalid day");
						break;
					}
				
				 case 2://2월
						if(int_day>=1&&int_day<=29){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							break;
						}
						
				 case 3:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							break;
						}
				 case 4:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 5:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 6:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 7:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.print("Error : invalid day");
							System.exit(1);
						}
				 case 8:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 9:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
						
				 case 10:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
						
				 case 11:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
						
							System.exit(1);
						}
				 case 12:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				default:{//위 case에 포함되지 않는 달인 경우
					
					System.out.println("Error : invalid month");
					break;}
				
		
				}
			
					
			}
			else {//윤달이 아닌 경우
				switch(int_month) {
				//달 별 유효한 날짜 지정
				 case 1:
					if(int_day>=1&&int_day<=31){
						System.out.println(date+ " is valid date");
						break;
			
					}
					else {
						System.out.println("Error : invalid day");
						System.exit(1);
					}
				
				 case 2:
						if(int_day>=1&&int_day<=28){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
						
				 case 3:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 4:
						if(int_day>=1&&int_day<=30){
							System.out.print(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 5:
					 	if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 6:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 7:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 8:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 9:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
						
				 case 10:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
						
				 case 11:
						if(int_day>=1&&int_day<=30){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				 case 12:
						if(int_day>=1&&int_day<=31){
							System.out.println(date+ " is valid date");
							break;
				
						}
						else {
							System.out.println("Error : invalid day");
							System.exit(1);
						}
				
		      	 default:{//위 case에 포함되지 않는 달인 경우
			 	
		      		System.out.println("Error : invalid month");
					System.exit(1);}
		
	
			}
		
				}
				
			}			

	
	}


