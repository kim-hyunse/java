import java.util.Scanner;
import java.io.*;

public class TextFileInputDemo3 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter file name");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();

		System.out.println("The file " + fileName);
		System.out.println("contains those following lines ");
		
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName));
			
			while (inputStream.hasNextLine()) {

				System.out.println(inputStream.nextLine());//nextLine �ݵ�� ����ϱ�
			}
		} finally {
			inputStream.close();

		}

	}
}
