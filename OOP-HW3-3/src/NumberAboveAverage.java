import java.util.Scanner;
public class NumberAboveAverage {

	public static void main(String[] args) {
	double[] temperature=new double[10];//�µ� array ����
	Scanner keyboard= new Scanner(System.in);
	double sum=0.00;//����
	System.out.println("Type 10 temperatures");//�µ� �Է�
	for (int i=0; i<temperature.length; i++) {//�� 10�� �ޱ�
		
		temperature[i]=keyboard.nextDouble();//temperature[i]�� �� ����
		sum+=temperature[i];//sum�� �� ���ϱ�

	}
	
	double average=sum/temperature.length;//��� ����/10
	System.out.println("Average is "+average);//���
		int high=0;
	for(int j=0; j<temperature.length; j++) {

		if(temperature[j]>average) {//�ݺ��� ���鼭 ��պ��� �� ���� �µ� ã��
			high++;
			System.out.println(temperature[j]);//���
			
			}
		
	}
	System.out.println(high+" is higher than aveage");

	}
}