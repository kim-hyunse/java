import java.io.*;
import java.util.*;

public class BinaryOutputDemo {

	public static void main(String[] args) {

		String fileName = "numebrs.dat";
		ObjectOutputStream outputStream = null;
		int num = 0;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));// 제발 외우자
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter nonnegative number");
			System.out.println("Place a negative number at the end");

			while (num >= 0) {
				num = keyboard.nextInt();
				outputStream.writeInt(num);

			}
			System.out.println("Numbers and sentinel value");
			System.out.println("Written to the file " + fileName);

			outputStream.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error with finding the file" + e);

		} catch (IOException e) {

			System.out.println("Error with opening the file" + e);

		}

	}

}
