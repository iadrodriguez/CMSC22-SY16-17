public class RCTester {
	public static void main(String[] args) {

	Resizable c1 = new ResizableCircle(100);
	c1.resize(50);
	System.out.println(c1); // 150
	c1.resize(-100);
	System.out.println(c1); // 0

	}
}