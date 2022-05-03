
public class RectangleDemo {

	public static void main(String[] args) {

		Rectangle myRectangle=new Rectangle();
		
		myRectangle.setDimensions(10, 5);
		System.out.println("Area is "+myRectangle.getArea());
		myRectangle.setDimensions(6, 5);
		System.out.println("Changed area is "+myRectangle.getArea());
		
	}
}
