import java.util.Scanner;

public class TotalCost {
private int purchaseorange;//��� �����ϴ���
private int purchaseegg;//��� �����ϴ���
private int purchaseapple;//��� �����ϴ���
private int purchasewatermelon;//��� �����ϴ���
private int purchasebagle;//��� �����ϴ���
private double orange;//������ �������� ����	
private double egg;//������ ����� ����	
private double apple;//������ ����� ����
private double watermelon;//������ ������ ����
private double bagle;//������ ���̱� ����
double total;
private int numorange;//������ ����	
private int numegg;//��� ����
private int numapple;//��� ����
private int numwatermelon;//���� ����
private int numbagle;//���̱� ����
public void writeOutput( )
{
     System.out.println( purchaseorange+" orange");//�����Ϸ��� ������ ����
     System.out.println("orange: at "+ numorange+" for $"+orange);//������ � �� ������	
     System.out.println("Cost for each $"+ orange/numorange);//������ �ϳ��� ����
     System.out.println("Total cost $"+orange/numorange*purchaseorange);//����� ������ ���� ���
     
     System.out.println( purchaseegg+" egg");//�����Ϸ��� ��� ����
     System.out.println("egg: at "+ numegg+" for $"+egg);//��� � �� ������	
     System.out.println("Cost for each $"+ egg/numegg);//��� �ϳ��� ����
     System.out.println("Total cost $"+ egg/numegg*purchaseegg);//����� ��� ���� ���
     
     System.out.println( purchaseapple+" apple");//�����Ϸ��� ��� ����
     System.out.println("apple: at "+ numapple+" for $"+apple);//��� � �� ������	
     System.out.println("Cost for each $"+ apple/numapple);//��� �ϳ��� ����
     System.out.println("Total cost $"+ apple/numapple*purchaseapple); //����� ��� ���� ��� 
     
     System.out.println( purchasewatermelon+" watermelon");//�����Ϸ��� ���� ����
     System.out.println("watermelon: at "+ numwatermelon+" for $"+watermelon);//���� � �� ������	
     System.out.println("Cost for each $"+ watermelon/numwatermelon);//���� �ϳ��� ����
     System.out.println("Total cost $"+ watermelon/numwatermelon*purchasewatermelon);//����� ���� ���� ���

     
     System.out.println("bagle: at "+ numbagle+" for $"+bagle);//�����Ϸ��� ���̱� ����
     System.out.println("Cost for each $"+ bagle/numbagle);//���̱� � �� ������	
     System.out.println("Total cost $"+ bagle/numbagle*purchasebagle);//���̱� �ϳ��� ����
     System.out.println( purchasebagle+" bagle");//����� ���̱� ���� ���
     
     total=(orange/numorange*purchaseorange)+(egg/numegg*purchaseegg)+(apple/numapple*purchaseapple)+(watermelon/numwatermelon*purchasewatermelon)+(bagle/numbagle*purchasebagle);
     System.out.println( "total item costed: $"+total);//��ü�� ���� ����
 
}


 public void setOrange(int numOrange,double neworange, int purchaseOrange) {//������ ���� num���� ���� ���� ����, �����Ϸ��� ���� ����
		   numorange=numOrange;
		   orange=neworange;
		   purchaseorange=purchaseOrange;
	   }
 public void setEgg( int numEgg,double newegg,int purchaseEgg) {//�Զ� ���� num���� ���� ���� ����, �����Ϸ��� ���� ����
	   numegg=numEgg;
	   egg=newegg;
	   purchaseegg=purchaseEgg;

 }

 public void setApple(int numApple, double newapple,int purchaseApple) {//��� ���� num���� ���� ���� ����, �����Ϸ��� ���� ����

	   apple=newapple;
	   numapple=numApple;
	   purchaseapple=purchaseApple;

 } 
 public void setWatermelon(int numWatermelon, double newwatermelon,int purchaseWatermelon) {//���� ���� num���� ���� ���� ����, �����Ϸ��� ���� ����
	
	   watermelon=newwatermelon;
	   numwatermelon=numWatermelon;
	   purchasewatermelon=purchaseWatermelon;

 }
 public void setBagle(int numBagle, double newbagle,int purchaseBagle) {//���̱� ���� num���� ���� ���� ����, �����Ϸ��� ���� ����

	 
	   numbagle=numBagle;
	   bagle=newbagle;
	   purchasebagle=purchaseBagle;

 }

 
}
