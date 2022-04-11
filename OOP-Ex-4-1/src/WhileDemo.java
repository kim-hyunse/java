import java.util.Scanner;
public class WhileDemo {
	
	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num=keyboard.nextInt();
	int buckle=1;
	while(num>=buckle) {
		System.out.print(buckle+" ,");
		buckle++;
	}	
	System.out.println(" ");
	System.out.println("Buckle my shoe");
	}
}
