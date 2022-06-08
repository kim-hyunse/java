public class TestMovable {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 5); // initial position x=y=5
		System.out.println(m1); // screen output: (5,5)
		m1.moveDown();
		System.out.println(m1); // screen output: (5,4)
		m1.moveRight();
		System.out.println(m1); // screen output: (6,4)
	}
}