 public class MovableCircle implements Movable {

 	private int radius;
 	private MovablePoint center;

 	public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
 		center = new MovablePoint(x, y, xSpeed, ySpeed);
 		this.radius = radius;
 	}

 	@Override
	public void moveUp() {
		center.moveUp(); //center.y -= center.ySpeed; 
	}

	@Override
	public void moveDown() {
		center.moveDown(); //center.y += center.ySpeed; 
	}

	@Override
	public void moveLeft() {
		center.moveLeft(); //center.x -= center.xSpeed; 
	}

	@Override
	public void moveRight() {
		center.moveRight(); //center.x += center.xSpeed; 
	}

	public void render() {
		for (int i = 0; i < (center.y - radius); i++) {
			System.out.println();
		}
		for (int i = 0; i < center.x; i++) {
			System.out.print(".");
		}
		System.out.println("*"); // up
		for (int i = 0; i < radius; i++) {
			System.out.println();
		}
		for (int i = 0; i < (center.x - radius); i++) {
			System.out.print(".");	
		}
		System.out.print("*"); // left
		for (int i = 0; i < (radius - 1); i++) {
			System.out.print(".");	
		}
		System.out.print("*"); // center
		for (int i = 0; i < (radius - 1); i++) {
			System.out.print(".");
		}
		System.out.println("*"); // right
		for (int i = 0; i < (radius - 1); i++) {
			System.out.println();
		}
		for (int i = 0; i < center.x; i++) {
			System.out.print(".");
		}
		System.out.println("*"); // down
	}

	public String toString() {
		return String.format("[radius = %d, center.x = %d, center.y = %d, xSpeed = %d, ySpeed = %d", radius, center.x, center.y, center.xSpeed, center.ySpeed);
	}

}