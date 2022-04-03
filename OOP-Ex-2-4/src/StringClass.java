
public class StringClass {

	public static void main(String[] args) {
		String sentence="Text processing is hard!";
		int index=sentence.indexOf("hard");
		System.out.println(sentence);
		System.out.println("01234567890123");
		System.out.println("The word \"hard\" is starts at index "+index);
		sentence=sentence.substring(0,index);
		sentence=sentence+"easy!";
		sentence=sentence.toUpperCase();
		System.out.println("The changed string is:");
		System.out.println(sentence);
		System.out.println("abc\\def");
		System.out.println("new\nline");
		char singlequote='\'';
		System.out.println(singlequote);
	
		
		

		
		
		
		
	}
}
