public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
		this(1.0, 1.0);
	}

	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return (length * width);
	}

	@Override
	public double getPerimeter() {
		return ((2 * length) + (2 * width));
	}

	@Override
	public String toString() {
		return String.format("A Rectangle with width = %f and length = %f, which is a subclass of %s", width, length, super.toString());
	}

}