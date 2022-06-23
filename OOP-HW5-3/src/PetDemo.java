import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class PetDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;//input stream
		PrintWriter outputStream = null;//output stream
		
		System.out.println("read or write?");//choose read or write
		Scanner keyboard = new Scanner(System.in);
		String answer=keyboard.nextLine();//read or write
		try {
		
		if(answer.equalsIgnoreCase("read")) {//read
			
			System.out.println("type name of file that read");//make file name
			String readFile=keyboard.nextLine();
			inputStream = new BufferedReader(new FileReader(readFile));//reader
			String l;
			while ((l = inputStream.readLine()) != null) {
				System.out.println(l);//print read information 
		}
			inputStream.close();
		}
		
		else if(answer.equalsIgnoreCase("write")) {//write
			System.out.println("type name of file that write");//make file name
			String writeFile=keyboard.nextLine();
			outputStream = new PrintWriter(new FileWriter(writeFile));//writer
			System.out.println("type how many records you desired");//record number
			int records = keyboard.nextInt();
			for(int i=0; i<records; i++) {//repeat
				System.out.println("type name, age, weight");
				String newName = keyboard.next();
				int newAge = keyboard.nextInt();
				double newWeight = keyboard.nextDouble();
				Pet myPet = new Pet( newName, newAge, newWeight);//set name, age, weight
				
				outputStream.print(myPet.getName()+" ");//getter
				outputStream.print(myPet.getAge()+" ");//getter
				outputStream.print(myPet.getWeight()+" ");//getter
				outputStream.println(" ");
			}
			outputStream.close();
		}
		
		}
		catch(Exception e) {
			
			System.out.println("End the program");
			System.exit(0);
		}
	
	}
	
}
