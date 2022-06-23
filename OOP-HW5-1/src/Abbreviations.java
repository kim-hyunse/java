import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Abbreviations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "1-abbreviations.txt";//abbreviation
		String inputFileName = "message.txt";//message
		String outputFileName = "output.txt";//result
		
		try {
			Scanner input = new Scanner(new File(inputFileName));
			String message = input.nextLine();//read file
			input.close();
			
			String result = message.replace(",", " ");//remove comma because of Iirc, 
			String m[] = result.split(" ");//separate by space
			
		
			Scanner abbreviations = new Scanner(new File(fileName));//read abbreviation
			
			
			while(abbreviations.hasNext())//abbreviation exists
			{
				String include = abbreviations.next();
				for(int i = 0; i<m.length; i++)
				{
					if(include.equalsIgnoreCase(m[i]))//search in m
					{
						m[i] = "<"+m[i]+">";//<> marker
						break;
					}
				}
			}
			abbreviations.close();
			
			PrintWriter output = new PrintWriter(new File(outputFileName));
			for(int i = 0; i<m.length; i++) {
				output.print(m[i]+" ");//print
				
			}
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error to open file "+ outputFileName);
			System.exit(0);
		}
	}
}