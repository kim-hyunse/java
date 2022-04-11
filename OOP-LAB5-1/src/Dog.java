
public class Dog {

	public String name;
	public String breed;
	public int age;
	public void writeOutput() {
		
		System.out.println("Name: "+name);
		System.out.println("breed: "+breed);
		System.out.println("age in calendar years: "+age);
		System.out.println("age in human years: "+getAgeInHumanYears());
		System.out.println();
		
	}

	public int getAgeInHumanYears() {
		
		
		int humanAge=0;
		if(age<=2) {
			
			humanAge=age*11;
		}
		else {
			
			humanAge=22+((age-2)*5);
			
		}
		
		return humanAge;
		
	}
	
	
}
