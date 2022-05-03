import java.util.Scanner;
public class DistributeGrade {
	private int aGrade;
	private int bGrade;
	private int cGrade;
	private int dGrade;	
	private int fGrade;//각자 grade에 몇명 있는지 표시
	int total;//총 인원
 

    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What number of get A?");//a 받은 사람 수
        aGrade = keyboard.nextInt();
        System.out.println("What number of get B?");//b 받은 사람 수
        bGrade =keyboard.nextInt();
        System.out.println("What number of get C?");//c 받은 사람 수
        cGrade =keyboard.nextInt();
        System.out.println("What number of get D?");//d 받은 사람 수
        dGrade =keyboard.nextInt();
        System.out.println("What number of get F?");//f 받은 사람 수
        fGrade =keyboard.nextInt();
        keyboard.close();

  
    }

	public void setGrade(int newaGrade,int newbGrade,int newcGrade,int newdGrade,int newfGrade) {	
		aGrade=newaGrade;
		bGrade=newbGrade;
		cGrade=newcGrade;
		dGrade=newdGrade;
		fGrade=newfGrade;//변수값 미리 지정, 세팅
		
	}
	
	public int getA() {
		return aGrade;
	}
	public int getB() {
		return bGrade;
	}
	public int getC() {
		return cGrade;
	}
	public int getD() {
		return dGrade;
	}
	public int getF() {
		return fGrade;
	}
		
	 public void writeOutput( )
	    {
		 		total=aGrade+bGrade+cGrade+dGrade+fGrade;//총 인원
		 		double aPerentage=Math.round(getA()*100.0/total);//a가 100퍼센트 중 차지하는 비율
		 		double bPerentage=Math.round(getB()*100.0/total);//b가 100퍼센트 중 차지하는 비율
		 		double cPerentage=Math.round(getC()*100.0/total);//c가 100퍼센트 중 차지하는 비율
		 		double dPerentage=Math.round(getD()*100.0/total);//d가 100퍼센트 중 차지하는 비율
		 		double fPerentage=Math.round(getF()*100.0/total);//f가 100퍼센트 중 차지하는 비율
		    	int aGraph=(int) Math.round(aPerentage/2);//a가 * 50개 중 차지하는 갯수
		    	int bGraph=(int) Math.round(bPerentage/2);//b가 * 50개 중 차지하는 갯수
		    	int cGraph=(int) Math.round(cPerentage/2);//c가 * 50개 중 차지하는 갯수
		    	int dGraph=(int) Math.round(dPerentage/2);//d가 * 50개 중 차지하는 갯수
		    	int fGraph=(int) Math.round(fPerentage/2);//f가 * 50개 중 차지하는 갯수

		 
	         System.out.println("percentage of A is "+ aPerentage);
	         System.out.println("percentage of B is "+ bPerentage);
	         System.out.println("percentage of C is "+ cPerentage);
	         System.out.println("percentage of D is "+ dPerentage);
	         System.out.println("percentage of F is "+ fPerentage);//각 퍼센티지 출력
	         
			 System.out.print("A:");//각 바 그래프 출력
			 	for(int i=0; i<aGraph; i++) {
			 		 System.out.print("*");}
			 	System.out.println("");
			 	 System.out.print("B:");
			 	for(int i=0; i<bGraph; i++) {
			         System.out.print("*");}
			 	System.out.println("");
			 	 System.out.print("C:");
			 	for(int i=0; i<cGraph; i++) {
			         System.out.print("*");}
			 	System.out.println("");
			 	 System.out.print("D:");
			 	for(int i=0; i<dGraph; i++) {
			         System.out.print("*");}
			 	System.out.println("");
				 System.out.print("F:");
			 	for(int i=0; i<fGraph; i++) {
			         System.out.print("*");}
	    }

 

	
	
}
