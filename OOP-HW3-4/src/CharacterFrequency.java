import java.util.Scanner;
public class CharacterFrequency {
	static String fullNum="";//show full number
	public static void main(String[] args) {
	String[] telNum= new String[10];//��ȭ��ȣ �Է¹��� �迭 ����
	int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;//���� ���Դ� �� ����
	Scanner keyboard=new Scanner(System.in);
	for(int i=0; i<telNum.length; i++) {//0~9����
		
		telNum[i]=keyboard.next();//��ȣ string���� �Է¹ޱ�
		int phoneNum=Integer.parseInt(telNum[i]);//��ȣ ������ �ٲ��ֱ�
		switch(phoneNum) {//������ �ٲ� ��ȣ case ���ֱ�
		case 0://0 �Է� �޾��� ��
			zero++;
			break;
		case 1://1 �Է� �޾��� ��
			one++;
			break;
		case 2://2 �Է� �޾��� ��
			two++;
			break;
		case 3://3 �Է� �޾��� ��
			three++;
			break;
		case 4://4 �Է� �޾��� ��
			four++;
			break;
		case 5://5�Է� �޾��� ��
			five++;
			break;
		case 6://6 �Է� �޾��� ��
			six++;
			break;
		case 7://7 �Է� �޾��� ��
			seven++;
			break;
		case 8://8 �Է� �޾��� ��
			eight++;
			break;
		case 9://9 �Է� �޾��� ��
			nine++;
			break;
				
		}
		fullNum+=telNum[i];//��ȣ �� �������� ��
	}


	System.out.println("full number is "+fullNum);//������ ��
	System.out.println("num 0: "+zero);//0 ����
	System.out.println("num 1: "+one);//1 ����
	System.out.println("num 2: "+two);//2 ����
	System.out.println("num 3: "+three);//3 ����
	System.out.println("num 4: "+four);//4 ����
	System.out.println("num 5: "+five);//5 ����
	System.out.println("num 6: "+six);//6 ����
	System.out.println("num 7: "+seven);//7 ����
	System.out.println("num 8: "+eight);//8 ����
	System.out.println("num 9: "+nine);//9 ����

	
	
	keyboard.close();
	}

}
