import java.util.*;
import java.util.Scanner;

public class SortByName
{
    public static void main(String[] args)
    {
        List<PetRecord> pet = new ArrayList<PetRecord>();//arraylist

      
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("how many pet record?");//pet number
        int loop = keyboard.nextInt();
        for(int i=0; i<loop; i++) { 
        	
        	PetRecord nextPet = new PetRecord();//petRecord
            nextPet.readInput();
            pet.add(nextPet);//add in arrayList
          
           
        }

        boolean sorted = false; 

        int petNum = pet.size() - 1;//max pet
        while(!sorted && petNum > 0)//sorted&& pet>0
        {
            
            
            sorted = true;
            for (int j = 0; j < petNum; j++)
            {
                if(((pet.get(j)).getName()).compareTo((pet.get(j + 1)).getName()) > 0 )//sort by name
                {
                    PetRecord temp = new PetRecord();
                    temp = pet.get(j);
                    pet.set(j, pet.get(j + 1) );
                    pet.set(j+1, temp);
                    sorted = false;
                }
            }
            petNum--;
        }
        
        for(int i = 0; i < pet.size(); ++i)//print sorted pet
        {
           
            System.out.println((PetRecord)pet.get(i));
            System.out.println();
        }

    }
}
    

