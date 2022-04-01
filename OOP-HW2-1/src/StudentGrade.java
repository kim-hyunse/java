import java.util.Scanner;

public class StudentGrade {//학생들 기록 입력

     private int quiz1;
     private int quiz2;
     private int quiz3;
     private int midtermExam;
     private int finalExam;
     private int total;
     private char grade=0;//변수 선언
     
     public void readInput( )
     {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the score about midterm exam? 0~100 ");//중간 점수 입력
        midtermExam = keyboard.nextInt( );
        while (midtermExam <0 ||midtermExam>100 )
        {
            System.out.println("Wrong exam range");//0~100 범위 벗어나면 경고 후 재입력
            System.out.println("Reenter score:");
            midtermExam =keyboard.nextInt( );
        }
        System.out.println("What is the score about final exam? 0~100");//기말 점수 입력
        finalExam =keyboard.nextInt( );
        while (finalExam <0 ||finalExam>100 )
        {
            System.out.println("Wrong exam range");
            System.out.println("Reenter score:");//0~100 범위 벗어나면 경고 후 재입력
            finalExam =keyboard.nextInt( );
        }
        System.out.println("What is the score about quiz1 exam? 0~10 ");//퀴즈1 점수 입력
        quiz1 = keyboard.nextInt( );
        while (quiz1 <0 ||quiz1>10 )//
        {
            System.out.println("Wrong quiz range");
            System.out.println("Reenter score:");//0~10 범위 벗어나면 경고 후 재입력
            quiz1 =keyboard.nextInt( );
        }
        System.out.println("What is the score about quiz2 exam? 0~10 ");//퀴즈2 점수 입력
        quiz2 = keyboard.nextInt( );
        while (quiz2 <0 ||quiz2>10 )
        {
            System.out.println("Wrong quiz range");
            System.out.println("Reenter score:");
            quiz2 =keyboard.nextInt( );//0~10 범위 벗어나면 경고 후 재입력
        }
        System.out.println("What is the score about quiz3 exam? 0~10 ");//퀴즈3 점수 입력
        quiz3 = keyboard.nextInt( );
        while (quiz3 <0 ||quiz3>10 )
        {
            System.out.println("Wrong quiz range");
            System.out.println("Reenter score:");//0~10 범위 벗어나면 경고 후 재입력
            quiz3 =keyboard.nextInt( );
      
    }
     }
     public void writeOutput( ) {

         System.out.println("midterem exam score = "+ midtermExam);//중간점수 출력	
         System.out.println("final exam score = "+ finalExam);//기말 점수 출력
         System.out.println("quiz1 score = "+ quiz1 );//퀴즈1 점수 출력
         System.out.println("quiz2 score = "+ quiz2 );//퀴즈2 점수 출력
         System.out.println("quiz3 score = "+ quiz3 );//퀴즈3 점수 출력

     }
     
public void convertValue(){
 double convertedMid= (getMidtermExam()*30/100.0);//점수 퍼센티지로 변환, 더 정확한 계산 위해 double로 값 저장

 double convertedFin=getFinalExam()*40/100.0;//점수 퍼센티지로 변환, 더 정확한 계산 위해 double로 값 저장

 double convertedQuiz1=getQuiz1( )*10/10.0;//점수 퍼센티지로 변환, 더 정확한 계산 위해 double로 값 저장

 double convertedQuiz2=getQuiz2( )*10/10.0;//점수 퍼센티지로 변환, 더 정확한 계산 위해 double로 값 저장
 
 double convertedQuiz3=getQuiz3( )*10/10.0;//점수 퍼센티지로 변환, 더 정확한 계산 위해 double로 값 저장

 total=(int)(convertedMid+convertedFin+convertedQuiz1+convertedQuiz2+convertedQuiz3);//점수 퍼센티지로 변환, 더 정확한 계산 위해 double로 값 저장했던 값들을 더해서 다시 int로 저장
	if(total>=90) {//점수 90~100사이: A
		 grade='A';
	}
	else if(total<90&&total>=80) {//점수 80~90사이: B
		grade='B';
	}
	else if(total<80&&total>=70) {//점수 70~80사이: C
		 grade='C';
	}
	else if(total<70&&total>=60) {//점수 60~70사이: D
		 grade='D';
	}
	else{//점수 60미만: F
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