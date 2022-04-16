
public class CharacterasticDemo {

public static void main(String[] args) {
 Characteristic likesSports = new Characteristic("likes sports");
 Characteristic likesBeaches = new Characteristic("likes beaches");


 likesSports.setRating();
 System.out.println("Displaying the rating we got: " + likesSports.getRating() );
 System.out.println();
 
 likesBeaches.setRating();
 System.out.println("Displaying the rating we got: " + likesBeaches.getRating() );
 System.out.println();
 
 Characteristic sueLikesFishing = new Characteristic("likes fishing");
 sueLikesFishing.setRating(6);
 Characteristic bobLikesFishing = new Characteristic("likes fishing");
 bobLikesFishing.setRating(6);
 
 System.out.println("Compatibility measure should be 1");
 System.out.println("\t" + sueLikesFishing.getCompatability(bobLikesFishing));
 
 System.out.println("Compatibility measure should be 0");
 System.out.println("\t" + sueLikesFishing.getCompatability(likesSports));
 sueLikesFishing.setRating(1);
 bobLikesFishing.setRating(9);
 
 System.out.println("Compatibility measure should be 0.209");
 System.out.println("\t" + sueLikesFishing.getCompatability(bobLikesFishing));
 sueLikesFishing.setRating(2);
 bobLikesFishing.setRating(9);
 
 System.out.println("Compatibility measure should be about 0.395");
 System.out.println("\t" + sueLikesFishing.getCompatability(bobLikesFishing));
 }
}
