import java.util.Scanner;
public class CharToInt {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	
	  System.out.println("Type a sentence");
	  String sentence=keyboard.next();
	  String lowSentence=sentence.toLowerCase();//소문자로 통일
	  
	  int[] alphabet=new int[26];
	  
		 
		  for(int i=0; i<lowSentence.length(); i++) {
		  //String에 입력한 값 char에 각각 저장
			  if(lowSentence.charAt(i)=='.') {
				  break;
			  }
			  char ch=lowSentence.charAt(i);
			  
			  alphabet[ch-97]++;
			  //array에 0번부터 26까지 들어오는 값 저장
		  
		  }
		  
		  for(int j=0; j<26; j++) { System.out.println((char)(97+j) + ":" + alphabet[j]);//알파벳과 그 갯수
		  
		  }
		  
		 
	
	keyboard.close();
	}
	
}

