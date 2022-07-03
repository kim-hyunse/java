import java.util.*;
import java.io.*;

public class Doubler {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("type input file name");
		String Input = keyboard.nextLine();
		System.out.println("type output file name");
		String Output = keyboard.nextLine();
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(Input));
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(Output));
			int num = 0;
			while (num >= 0) {

				num = inputStream.readInt();
				int doubler = num * 2;

				outputStream.writeInt(doubler);
				System.out.println(doubler);
			}

			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("file cannot find" + Input);

		} catch (EOFException e) {
			System.out.println("file end" + Input);

		} catch (IOException e) {
			System.out.println("file cannot open" + Input);

		}

	}
}
