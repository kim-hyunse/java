import java.util.Scanner;//scanner Ŭ���� ����
 

public class IsValidDate {//��¥�� ��ȿ�� �� Ȯ��
	
	public static void main(String[] args) {
	
		Scanner keyboard= new Scanner(System.in);
		String date;
		System.out.println("Type Strings");// string �Է��ϱ� ���� mm/dd/yyyy
		date=keyboard.next();
	
		String year = date.substring(date.length()-4);//�� ���ڸ�(����)�� �ڸ���
		int int_year=Integer.parseInt(year);//���������� Ÿ�� ��ȯ
		
		String month = date.substring(0, 2);//�� ���ڸ�(��)�� �ڸ���
		int int_month=Integer.parseInt(month);//���������� Ÿ�� ��ȯ
		
		String day = date.substring(3, 5);//�ϸ� �ڸ���
		int int_day=Integer.parseInt(day);//���������� Ÿ�� ��ȯ
		

			if(int_year%4==0&&int_year%400==0) {//������ ���
				switch(int_month) {
				//�� �� ��ȿ�� ��¥ ����
				 case 1://1��
					if(int_day>=1&&int_day<=31){
						System.out.println(date+ " is valid date");//��ȿ�� ��¥�� ���
						break;
			
					}
					else {
						System.out.println("Error : invalid day");
						break;
					}
				
				 case 2://2��
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
				default:{//�� case�� ���Ե��� �ʴ� ���� ���
					
					System.out.println("Error : invalid month");
					break;}
				
		
				}
			
					
			}
			else {//������ �ƴ� ���
				switch(int_month) {
				//�� �� ��ȿ�� ��¥ ����
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
				
		      	 default:{//�� case�� ���Ե��� �ʴ� ���� ���
			 	
		      		System.out.println("Error : invalid month");
					System.exit(1);}
		
	
			}
		
				}
				
			}			

	
	}


