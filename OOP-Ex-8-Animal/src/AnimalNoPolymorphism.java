
public class AnimalNoPolymorphism {

	private String animalName;
	private String spicies;
	private void playDuckSound() {
		System.out.println("QUACK");
	}
	private void playDogSound() {
		System.out.println("WOOF");
	}
	private void playCatSound() {
		System.out.println("MEW");
	}

	public void speak() {
		
		if(spicies.equals("Duck")) {
			
			this.playDuckSound();
			
		}
		else if(spicies.equals("Dog")) {
			
			this.playDogSound();
			
		}
		else if(spicies.equals("Cat")) {
			
			this.playCatSound();
			
		}
		//if we want to add Cow, and there are more methods depend on the spicies?
		//In this case, we need to a lot modifying class. So, we use polymorphism.
	}

	
	
}
