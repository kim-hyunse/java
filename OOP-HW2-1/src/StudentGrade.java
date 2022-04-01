import java.util.Scanner;

public class StudentGrade {//�л��� ��� �Է�

     private int quiz1;
     private int quiz2;
     private int quiz3;
     private int midtermExam;
     private int finalExam;
     private int total;
     private char grade=0;//���� ����
     
     public void readInput( )
     {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the score about midterm exam? 0~100 ");//�߰� ���� �Է�
        midtermExam = keyboard.nextInt( );
        while (midtermExam <0 ||midtermExam>100 )
        {
            System.out.println("Wrong exam range");//0~100 ���� ����� ��� �� ���Է�
            System.out.println("Reenter score:");
            midtermExam =keyboard.nextInt( );
        }
        System.out.println("What is the score about final exam? 0~100");//�⸻ ���� �Է�
        finalExam =keyboard.nextInt( );
        while (finalExam <0 ||finalExam>100 )
        {
            System.out.println("Wrong exam range");
            System.out.println("Reenter score:");//0~100 ���� ����� ��� �� ���Է�
            finalExam =keyboard.nextInt( );
        }
        System.out.println("What is the score about quiz1 exam? 0~10 ");//����1 ���� �Է�
        quiz1 = keyboard.nextInt( );
        while (quiz1 <0 ||quiz1>10 )//
        {
            System.out.println("Wrong quiz range");
            System.out.println("Reenter score:");//0~10 ���� ����� ��� �� ���Է�
            quiz1 =keyboard.nextInt( );
        }
        System.out.println("What is the score about quiz2 exam? 0~10 ");//����2 ���� �Է�
        quiz2 = keyboard.nextInt( );
        while (quiz2 <0 ||quiz2>10 )
        {
            System.out.println("Wrong quiz range");
            System.out.println("Reenter score:");
            quiz2 =keyboard.nextInt( );//0~10 ���� ����� ��� �� ���Է�
        }
        System.out.println("What is the score about quiz3 exam? 0~10 ");//����3 ���� �Է�
        quiz3 = keyboard.nextInt( );
        while (quiz3 <0 ||quiz3>10 )
        {
            System.out.println("Wrong quiz range");
            System.out.println("Reenter score:");//0~10 ���� ����� ��� �� ���Է�
            quiz3 =keyboard.nextInt( );
      
    }
     }
     public void writeOutput( ) {

         System.out.println("midterem exam score = "+ midtermExam);//�߰����� ���	
         System.out.println("final exam score = "+ finalExam);//�⸻ ���� ���
         System.out.println("quiz1 score = "+ quiz1 );//����1 ���� ���
         System.out.println("quiz2 score = "+ quiz2 );//����2 ���� ���
         System.out.println("quiz3 score = "+ quiz3 );//����3 ���� ���

     }
     
public void convertValue(){
 double convertedMid= (getMidtermExam()*30/100.0);//���� �ۼ�Ƽ���� ��ȯ, �� ��Ȯ�� ��� ���� double�� �� ����

 double convertedFin=getFinalExam()*40/100.0;//���� �ۼ�Ƽ���� ��ȯ, �� ��Ȯ�� ��� ���� double�� �� ����

 double convertedQuiz1=getQuiz1( )*10/10.0;//���� �ۼ�Ƽ���� ��ȯ, �� ��Ȯ�� ��� ���� double�� �� ����

 double convertedQuiz2=getQuiz2( )*10/10.0;//���� �ۼ�Ƽ���� ��ȯ, �� ��Ȯ�� ��� ���� double�� �� ����
 
 double convertedQuiz3=getQuiz3( )*10/10.0;//���� �ۼ�Ƽ���� ��ȯ, �� ��Ȯ�� ��� ���� double�� �� ����

 total=(int)(convertedMid+convertedFin+convertedQuiz1+convertedQuiz2+convertedQuiz3);//���� �ۼ�Ƽ���� ��ȯ, �� ��Ȯ�� ��� ���� double�� �� �����ߴ� ������ ���ؼ� �ٽ� int�� ����
	if(total>=90) {//���� 90~100����: A
		 grade='A';
	}
	else if(total<90&&total>=80) {//���� 80~90����: B
		grade='B';
	}
	else if(total<80&&total>=70) {//���� 70~80����: C
		 grade='C';
	}
	else if(total<70&&total>=60) {//���� 60~70����: D
		 grade='D';
	}
	else{//���� 60�̸�: F
		 grade='F';
	}

    System.out.println("total score = "+ total );
	System.out.println("letter grade = "+ grade );
       }
    

public void setStudentGrade(int newquiz1 , int newquiz2,
        int newquiz3, int newfinalExam, int newmidtermExam )
{     quiz1 = newquiz1;
	  quiz2=newquiz2;
	  quiz3=newquiz3;
	  finalExam=newfinalExam;
	  midtermExam=newmidtermExam;

}
public int getQuiz1( )
{
    return quiz1;
}

public int getQuiz2( )
{
    return quiz2;
}

public int getQuiz3( )
{
    return quiz3;
}
public int getFinalExam( )
{
    return finalExam;
}

public int getMidtermExam( )
{
    return midtermExam;
}


}