import java.util.Scanner;
public class DistributeGrade {
	private int aGrade;
	private int bGrade;
	private int cGrade;
	private int dGrade;	
	private int fGrade;//���� grade�� ��� �ִ��� ǥ��
	int total;//�� �ο�
 

    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What number of get A?");//a ���� ��� ��
        aGrade = keyboard.nextInt();
        System.out.println("What number of get B?");//b ���� ��� ��
        bGrade =keyboard.nextInt();
        System.out.println("What number of get C?");//c ���� ��� ��
        cGrade =keyboard.nextInt();
        System.out.println("What number of get D?");//d ���� ��� ��
        dGrade =keyboard.nextInt();
        System.out.println("What number of get F?");//f ���� ��� ��
        fGrade =keyboard.nextInt();
        keyboard.close();

  
    }

	public void setGrade(int newaGrade,int newbGrade,int newcGrade,int newdGrade,int newfGrade) {	
		aGrade=newaGrade;
		bGrade=newbGrade;
		cGrade=newcGrade;
		dGrade=newdGrade;
		fGrade=newfGrade;//������ �̸� ����, ����
		
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
		 		total=aGrade+bGrade+cGrade+dGrade+fGrade;//�� �ο�
		 		double aPerentage=Math.round(getA()*100.0/total);//a�� 100�ۼ�Ʈ �� �����ϴ� ����
		 		double bPerentage=Math.round(getB()*100.0/total);//b�� 100�ۼ�Ʈ �� �����ϴ� ����
		 		double cPerentage=Math.round(getC()*100.0/total);//c�� 100�ۼ�Ʈ �� �����ϴ� ����
		 		double dPerentage=Math.round(getD()*100.0/total);//d�� 100�ۼ�Ʈ �� �����ϴ� ����
		 		double fPerentage=Math.round(getF()*100.0/total);//f�� 100�ۼ�Ʈ �� �����ϴ� ����
		    	int aGraph=(int) Math.round(aPerentage/2);//a�� * 50�� �� �����ϴ� ����
		    	int bGraph=(int) Math.round(bPerentage/2);//b�� * 50�� �� �����ϴ� ����
		    	int cGraph=(int) Math.round(cPerentage/2);//c�� * 50�� �� �����ϴ� ����
		    	int dGraph=(int) Math.round(dPerentage/2);//d�� * 50�� �� �����ϴ� ����
		    	int fGraph=(int) Math.round(fPerentage/2);//f�� * 50�� �� �����ϴ� ����

		 
	         System.out.println("percentage of A is "+ aPerentage);
	         System.out.println("percentage of B is "+ bPerentage);
	         System.out.println("percentage of C is "+ cPerentage);
	         System.out.println("percentage of D is "+ dPerentage);
	         System.out.println("percentage of F is "+ fPerentage);//�� �ۼ�Ƽ�� ���
	         
			 System.out.print("A:");//�� �� �׷��� ���
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
