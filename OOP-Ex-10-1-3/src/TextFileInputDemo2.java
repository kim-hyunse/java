import java.util.Scanner;
import java.io.*;

public class TextFileInputDemo2 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter file name");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();

		System.out.println("The file " + fileName);
		System.out.println("contains those following lines ");
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(fileName));
			String line = null;
			while ((line = inputStream.readLine()) != null) {

				System.out.println(line);
			}
		} finally {
			inputStream.close();

		}

	}
}
