import java.util.Scanner;
public class CharToInt {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	
	  System.out.println("Type a sentence");
	  String sentence=keyboard.next();
	  String lowSentence=sentence.toLowerCase();//�ҹ��ڷ� ����
	  
	  int[] alphabet=new int[26];
	  
		 
		  for(int i=0; i<lowSentence.length(); i++) {
		  //String�� �Է��� �� char�� ���� ����
			  if(lowSentence.charAt(i)=='.') {
				  break;
			  }
			  char ch=lowSentence.charAt(i);
			  
			  alphabet[ch-97]++;
			  //array�� 0������ 26���� ������ �� ����
		  
		  }
		  
		  for(int j=0; j<26; j++) { System.out.println((char)(97+j) + ":" + alphabet[j]);//���ĺ��� �� ����
		  
		  }
		  
		 
	
	keyboard.close();
	}
	
}

