import java.util.Scanner;
public class CharacterFrequency {
	
	public static void main(String[] args) {
		
	String telNum= new String();//��ȭ��ȣ �Է¹��� ���ڿ� ����
	
	
	Scanner keyboard=new Scanner(System.in);
	telNum=keyboard.nextLine();//��ȣ string���� �Է¹ޱ�

	int[] number=new int[10];
	
	for(int i=0; i<number.length; i++) {
		char num=telNum.charAt(i);//String�� �Է��� �� char�� ���� ����
		number[(int)num-48]++;//array�� 0������ 9���� ������ �� ����
		
	}

    for(int j=0; j<number.length; j++) {
        System.out.println(j + ":" + number[j]);//���� ����
    }
	
	
	keyboard.close();
	}

}
