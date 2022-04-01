import java.util.Scanner;

public class TotalCost {
private int purchaseorange;//몇개를 구입하는지
private int purchaseegg;//몇개를 구입하는지
private int purchaseapple;//몇개를 구입하는지
private int purchasewatermelon;//몇개를 구입하는지
private int purchasebagle;//몇개를 구입하는지
private double orange;//단위당 오렌지의 가격	
private double egg;//단위당 계란의 가격	
private double apple;//단위당 사과의 가격
private double watermelon;//단위당 수박의 가격
private double bagle;//단위당 베이글 가격
double total;
private int numorange;//오렌지 단위	
private int numegg;//계란 단위
private int numapple;//사과 단위
private int numwatermelon;//수박 단위
private int numbagle;//베이글 단위
public void writeOutput( )
{
     System.out.println( purchaseorange+" orange");//구매하려는 오렌지 개수
     System.out.println("orange: at "+ numorange+" for $"+orange);//오렌지 몇개 당 얼마인지	
     System.out.println("Cost for each $"+ orange/numorange);//오렌지 하나의 가격
     System.out.println("Total cost $"+orange/numorange*purchaseorange);//사려는 오렌지 가격 계산
     
     System.out.println( purchaseegg+" egg");//구매하려는 계란 개수
     System.out.println("egg: at "+ numegg+" for $"+egg);//계란 몇개 당 얼마인지	
     System.out.println("Cost for each $"+ egg/numegg);//계란 하나의 가격
     System.out.println("Total cost $"+ egg/numegg*purchaseegg);//사려는 계란 가격 계산
     
     System.out.println( purchaseapple+" apple");//구매하려는 사과 개수
     System.out.println("apple: at "+ numapple+" for $"+apple);//사과 몇개 당 얼마인지	
     System.out.println("Cost for each $"+ apple/numapple);//사과 하나의 가격
     System.out.println("Total cost $"+ apple/numapple*purchaseapple); //사려는 사과 가격 계산 
     
     System.out.println( purchasewatermelon+" watermelon");//구매하려는 수박 개수
     System.out.println("watermelon: at "+ numwatermelon+" for $"+watermelon);//수박 몇개 당 얼마인지	
     System.out.println("Cost for each $"+ watermelon/numwatermelon);//수박 하나의 가격
     System.out.println("Total cost $"+ watermelon/numwatermelon*purchasewatermelon);//사려는 수박 가격 계산

     
     System.out.println("bagle: at "+ numbagle+" for $"+bagle);//구매하려는 베이글 개수
     System.out.println("Cost for each $"+ bagle/numbagle);//베이글 몇개 당 얼마인지	
     System.out.println("Total cost $"+ bagle/numbagle*purchasebagle);//베이글 하나의 가격
     System.out.println( purchasebagle+" bagle");//사려는 베이글 가격 계산
     
     total=(orange/numorange*purchaseorange)+(egg/numegg*purchaseegg)+(apple/numapple*purchaseapple)+(watermelon/numwatermelon*purchasewatermelon)+(bagle/numbagle*purchasebagle);
     System.out.println( "total item costed: $"+total);//전체를 더한 가격
 
}


 public void setOrange(int numOrange,double neworange, int purchaseOrange) {//오렌지 세팅 num물건 개당 물건 가격, 구매하려는 물건 개수
		   numorange=numOrange;
		   orange=neworange;
		   purchaseorange=purchaseOrange;
	   }
 public void setEgg( int numEgg,double newegg,int purchaseEgg) {//게란 세팅 num물건 개당 물건 가격, 구매하려는 물건 개수
	   numegg=numEgg;
	   egg=newegg;
	   purchaseegg=purchaseEgg;

 }

 public void setApple(int numApple, double newapple,int purchaseApple) {//사과 세팅 num물건 개당 물건 가격, 구매하려는 물건 개수

	   apple=newapple;
	   numapple=numApple;
	   purchaseapple=purchaseApple;

 } 
 public void setWatermelon(int numWatermelon, double newwatermelon,int purchaseWatermelon) {//수박 세팅 num물건 개당 물건 가격, 구매하려는 물건 개수
	
	   watermelon=newwatermelon;
	   numwatermelon=numWatermelon;
	   purchasewatermelon=purchaseWatermelon;

 }
 public void setBagle(int numBagle, double newbagle,int purchaseBagle) {//베이글 세팅 num물건 개당 물건 가격, 구매하려는 물건 개수

	 
	   numbagle=numBagle;
	   bagle=newbagle;
	   purchasebagle=purchaseBagle;

 }

 
}
