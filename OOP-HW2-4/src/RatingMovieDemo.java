
public class RatingMovieDemo {

	public static void main(String[] args){
	RatingMovie demo=new RatingMovie();
	demo.setMovie("avengers","G");
	demo.addRating(5);
	demo.writeOutput();
	demo.setMovie("avengers","G");
	demo.addRating(4);
	demo.writeOutput();
	demo.setMovie("avengers","G");
	demo.addRating(2);
	demo.writeOutput();
	
}
}