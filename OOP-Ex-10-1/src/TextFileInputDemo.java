import java.io.*;
import java.util.Scanner;

public class TextFileInputDemo {

	public static void main(String[] args) {

		String fileName = "out.txt";
		Scanner inputStream = null;
		System.out.println("The file " + fileName);
		System.out.println("contains the following lines ");
		try {

			inputStream = new Scanner(new File(fileName));

		} catch (FileNotFoundException e) {

			System.out.println("Error opening file" + fileName);
			System.exit(0);
		}

		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);

		}

		inputStream.close();

	}
}
