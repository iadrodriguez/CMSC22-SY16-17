public class MovableRectangle implements Movable, Drawable {

	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}

	// Bonus
	public void render() {
		int xLength = Math.abs(topLeft.x - bottomRight.x);
		int yLength = Math.abs(topLeft.y - bottomRight.y);

		for (int i = 0; i < topLeft.y; i++) {
			System.out.print("\n");
		}

			for (int k = 0; k < topLeft.x; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < xLength; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			for (int k = 0; k < yLength - 2; k++) {
				for (int i = 0; i < topLeft.x; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = 0; j < xLength - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int k = 0; k < topLeft.x; k++) {
				System.out.print(" ");
			}
			for (int z = 0; z < xLength; z++) {
				System.out.print("*");
			}
			System.out.print("\n");
	}

	public String toString() {
		return String.format("x1 = %d, y1 = %d, x2 = %d, y2 = %d, x1Speed = %d, y1Speed = %d, x2Speed = %d, y2Speed = %d", topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, topLeft.xSpeed, topLeft.ySpeed, bottomRight.xSpeed, bottomRight.ySpeed);
	}
}