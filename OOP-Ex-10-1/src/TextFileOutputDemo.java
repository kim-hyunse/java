import java.io.*;
import java.util.Scanner;

public class TextFileOutputDemo {

	public static void main(String[] args) {

		String fileName = "out.txt";
		PrintWriter outputStream;
		outputStream = null;
		try {
			outputStream = new PrintWriter("out.txt");

		} catch (FileNotFoundException e) {
			System.out.println("Error opening file" + fileName);
			System.exit(0);
		}
		System.out.println("Enter three lines of text");
		String[] arr = new String[3];
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {

			arr[i] = keyboard.nextLine();
			outputStream.println((i+1)+" "+arr[i]);
		}
		System.out.println("Those line were written to "+fileName);
	outputStream.close();
	}

}
