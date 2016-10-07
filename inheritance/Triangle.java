public class Triangle extends Shape{

	private double s1;
	private double s2;
	private double s3;

	public Triangle(double s1, double s2, double s3) {
		if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
			throw new IllegalArgumentException("illegal sides of a triangle!");
		} else {
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}
	}

	public Triangle(double s1, double s2, double s3, String color, boolean filled) {
		super(color, filled);
		if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
			throw new IllegalArgumentException("illegal sides of a triangle!");
		} else {
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
			
		}
	}

	public double getSide1() {
		return s1;
	}

	public double getSide2() {
		return s2;
	}

	public double getSide3() {
		return s3;
	}

	public void setSide1(double s1) {
		this.s1 = s1;
	}

	public void setSide2(double s2) {
		this.s2 = s2;
	}

	public void setSide3(double s3) {
		this.s3 = s3;
	}

	@Override
	public double getPerimeter() {
		return (s1 + s2 + s3);
	}

	@Override
	public double getArea() { 
		double p = getPerimeter() / 2;
		return Math.sqrt(p);
	}

	public String toString() {
		return String.format("A Triangle with side1 = %f, side2 = %f, and side3 = %f which is a subclass of %s", s1, s2, s3, super.toString());
	}
}
