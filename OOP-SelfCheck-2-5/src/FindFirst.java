
public class FindFirst {

	public static void main(String[] args) {
	String example=" Hello, my good friend!";
	String example1=example.trim();
	int index=example1.indexOf(" ");
	String first=example1.substring(0,index);
	
	

	System.out.println(first);
	
	}
}
