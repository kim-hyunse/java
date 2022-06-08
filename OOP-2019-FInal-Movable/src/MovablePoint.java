
public class MovablePoint implements Movable {

	int xPoint;
	int yPoint;

	public MovablePoint(int xPoint, int yPoint) {

		this.xPoint = xPoint;
		this.yPoint = yPoint;

	}

	public void getMovablePoint() {

		int x = this.xPoint;
		int y = this.yPoint;

	}

	public void moveUp() {

		this.yPoint += 1;
	}

	public void moveDown() {

		this.yPoint -= 1;

	}

	public void moveLeft() {

		this.xPoint -= 1;

	}

	public void moveRight() {

		this.xPoint += 1;

	}

	
	public String toString() {
		String point = "(" + this.xPoint + "," + this.yPoint + ")";
		return point;
	}

}
