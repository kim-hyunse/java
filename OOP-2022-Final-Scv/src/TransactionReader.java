import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class TransactionReader {

	public static void main(String[] args) {

		// target file: <data.txt> in <c:\homework> directory (filename contains
		// C:\homework\data.txt)

		String fileName = "data.txt";

		try {

			Scanner inputStream = new Scanner(new FileInputStream(fileName));

			// Read the header line

			String line = inputStream.nextLine();

			double total = 0; // Total sales

			// Read the rest of the file line by line

			while (inputStream.hasNextLine()) {

				// Contains SKU,Quantity,Price,Description

				line = inputStream.nextLine();

				// Turn the string into an array of strings

				String[] ary = line.split(",");

				// Extract each item

				String SKU = ary[0];

				int quantity = Integer.parseInt(ary[1]);

				double price = Double.parseDouble(ary[2]);

				String description = ary[3];

				// Output item

				System.out.printf("Sold %d of %s (SKU: %s) at $%1.2f each.\n",

						quantity, description, SKU, price);

				// Compute total

				total += quantity * price;

			}

			System.out.printf("Total sales: $%1.2f\n", total);

			inputStream.close();

		}

		catch (Exception e) {

			System.out.println("Problem with input from file " + fileName);

		}

	}

}