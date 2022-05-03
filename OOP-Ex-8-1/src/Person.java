
public class Person {

	private String name;
	public Person() {
		name="No name yet";	
	}
	public Person(String initializeName) {
		name=initializeName;
	}
	public void setName(String newName) {	
		name=newName;
	}
	public String getName() {
		return name;
	}
	public void writeOutput() {
		System.out.println("name: "+name);
	}
	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);
	}
	
}
