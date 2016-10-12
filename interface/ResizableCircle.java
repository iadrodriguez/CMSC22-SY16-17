public class ResizableCircle extends Circle implements Resizable, Drawable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	public void resize(int percentage) {
		radius = ((radius * (percentage / 100.0)) + radius);
	}

	// Bonus
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


	@Override
	public String toString() {
		return String.format("radius = %f", super.radius);
	}
}