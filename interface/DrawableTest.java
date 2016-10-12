public class DrawableTest {
	public static void main(String[] args) {

	MovableRectangle m1 = new MovableRectangle(1, 2, 4, 5, 2, 2);
	m1.render();
	System.out.print("===================================================== ");
	MovableRectangle m2 = new MovableRectangle(5, 9, 12, 15, 2, 2);
	m2.render();
	m2.moveLeft();
	System.out.println("===================================================== ");
	m2.render();
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("MOVED LEFT!\n");
	System.out.println("===================================================== ");

	MovableCircle m3 = new MovableCircle(10, 9, 10, 5, 5);
	m3.render();

	}
}