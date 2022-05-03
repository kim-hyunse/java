import java.util.Scanner;
public class Characteristic{

	private String description;
	private int rating;
	private double measure=0.00;
	Scanner keyboard= new Scanner(System.in);
	Characteristic (String charcter){
		description=charcter;
	}

	private boolean isValid(int rating) {
		
		if(rating>10&&rating<0) {

			return false;
	}
		else {
			return true;}
		}
	
	private boolean isMatch(Characteristic bobLikesFishing) {
		
		return this.description.equals(bobLikesFishing);
		}
	
	
	public void setRating() {
		
		this.rating=keyboard.nextInt();
		if(!isValid(this.rating)) {

			System.out.println("invalid value");
			System.exit(0);
		}
	}
	
public void setRating(int rating) {
		
		if(isValid(rating)) {
			this.rating=rating;
			
		}
	}
	
	public void setDescription() {
		
		this.description=keyboard.next();
	}
	
	public int getRating() {
		
		return rating;
	}
	
	public String getDescription() {
		return description;
	}
	


    public double getCompatability(Characteristic bobLikesFishing) {//È£È¯¼º
		 
    	measure=1-Math.pow((this.rating-bobLikesFishing.rating),2)/81;
		if(this.rating==0||bobLikesFishing.rating==0) {
			return 0;
		}
		return measure;
	}
	
   
	
	
	}