
public class FindSecond {



	public static void main(String[] args) {
	String example=" Hello, my good friend!";//���ڿ� �Է�
	String example1=example.trim();//�տ� ��ĭ ����
	int index=example1.indexOf(" ");//���Ⱑ ÷ ������ ���ڿ� ��ġ index�� ����
	String example2=example1.substring(index);//���� �޳������ example2�� ����
	String example3=example2.trim();//�տ� ���� ����
	int index2=example3.indexOf(" ");//index2�� example3���� ó�� ���� ������ ���ڿ� ��ġ ����
	String second=example3.substring(0,index2);//0(�ڸ� ���ڿ��� ó�� ���۵Ǵ� ����)���� ������� ���
	
	
	

	System.out.println(second);
	

}

}
