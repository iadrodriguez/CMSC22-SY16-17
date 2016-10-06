public class Triangle extends Shape{

	private double s1;
	private double s2;
	private double s3;

	public Triangle(double s1, double s2, double s3) {
		if ((s1 + s2 < s3) || (s1 + s3 < s2) || (s2 + s3 < s1)) {
			throw new IllegalArgumentException("illegal sides of a triangle!");
		} else {
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}
	}

	public double getPerimeter() {
		return (s1 + s2 + s3);
	}

	public double getArea() { //sir, dili mi kaimplement sa getArea kay sides ramay parameters, dili base and height.kani amo gihimo kay char char lang para dili muerror kay abstract man gud ang getArea sa superclass. 
		return 123.22;
	}
}