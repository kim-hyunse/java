import java.util.Scanner;

public class Area {
	public static final double PI = 3.141592;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the radius of a circle in inches");
		float radius = keyboard.nextFloat();
		System.out.println("A circle of radius is " + radius + " inches");
		// public static final double PI=3.1415; main�ȿ��� ���� X. public ��ü �ȿ� �� ��ü X
		System.out.println("has an area of " + radius * radius + " square inches");

		keyboard.close();

	}
}
