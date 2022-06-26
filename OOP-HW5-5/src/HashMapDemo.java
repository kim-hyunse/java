import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();//hashmap
		int number=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			number = keyboard.nextInt();
			if(number == -1)//sentinel vvalue:-1
				break;
			if(hash.containsKey(number))
			{
				int value = hash.get(number);
				value++;
				hash.put(number, value);
			}
			else
				hash.put(number, 1);
		}
		keyboard.close();
		
		for(int i : hash.keySet()) {//print histogram by for each
			System.out.println("The number " + i +" occurs " + hash.get(i) + " times.");
		}
	}

}