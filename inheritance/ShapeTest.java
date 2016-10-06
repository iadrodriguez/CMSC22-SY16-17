

public class ShapeTest {
   public static void main(String[] args) {

// Exercise 1 Tester:

     //  // Test constructor and toString()
     //  Shape s = new Shape();
     //  System.out.println(s);  // toString()

     // Shape s1 = new Shape("yellow", false);
     //  System.out.println(s1);
     //  // Test Setters and Getters
     //  s1.setColor("blue");
     //  System.out.println(s1);
     //  System.out.println(s1.getColor());

     //  s1.setFilled(true);
     //  System.out.println(s1);
     //  System.out.println(s1.isFilled());

      System.out.println("CIRCLE");


      Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
      System.out.println(s1); // which version? The version here is from Shape and not from circle
      System.out.println(s1.getArea()); // which version? The version here is from Circle since getArea in Shape is abstract, thus it follows the method of getArea in class Circle
      System.out.println(s1.getPerimeter()); // which version?The version here is from Circle since getPerimeter in Shape is abstract, thus it follows the method of getPerimeter in objet Circle
      System.out.println(s1.getColor()); //The version here is from Shape and not from circle
      System.out.println(s1.isFilled());
      //System.out.println(s1.getRadius()); // error because s1 refers to shape which does'nt have a getRadius method...

      Circle c1 = (Circle)s1; // Downcast back to Circle
      System.out.println(c1);
      System.out.println(c1.getArea());
      System.out.println(c1.getPerimeter());
      System.out.println(c1.getColor());
      System.out.println(c1.isFilled());
      System.out.println(c1.getRadius());

      System.out.println("RECTANGLE!");

      // Shape s2 = new Shape();// We can't create a new object Shape s2 because shape is abstract.
      Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // 
      System.out.println(s3);
      System.out.println(s3.getArea());
      System.out.println(s3.getPerimeter());
      System.out.println(s3.getColor());
      //System.out.println(s3.getLength()); // error because s3 refers to shape which does'nt have a getLength() method...
      
      Rectangle r1 = (Rectangle)s3; // downcast
      System.out.println(r1);
      System.out.println(r1.getArea());
      System.out.println(r1.getColor());
      System.out.println(r1.getLength());

      System.out.println("SQUARE!"); 

      Shape s4 = new Square(6.6); // Upcast
      System.out.println(s4);
      System.out.println(s4.getArea()); 
      System.out.println(s4.getColor());
      //System.out.println(s4.getSide()); //s4 does not inherit the getSide method because s4 now is a shape and not necessarily a square.

      // Take note that we downcast Shape s4 to Rectangle ,
      // which is a superclass of Square, instead of Square
      
      System.out.println("RECTANGLE!");

      Rectangle r2 = (Rectangle)s4;
      System.out.println(r2);
      System.out.println(r2.getArea());
      System.out.println(r2.getColor());
      // System.out.println(r2.getSide()); //here the square s4 is downcast to rectangle r2. but rectangle r2 don't have the getSide() method.
      System.out.println(r2.getLength());
      // Downcast Rectangle r2 to Square
      
      System.out.println("SQUARE!"); 

      Square sq1 = (Square)r2;
      System.out.println(sq1);
      System.out.println(sq1.getArea());
      System.out.println(sq1.getColor());
      System.out.println(sq1.getSide());
      System.out.println(sq1.getLength());

      System.out.println("TRIANGLE!");

      Shape t2 = new Triangle(6, 4, 10);
      System.out.println(t2);
      System.out.println(t2.getPerimeter());
      System.out.println(t2.getArea());  
      System.out.println(t2.getColor());

      System.out.println("hi");
      Shape t1 = new Triangle(1, 4, 10); // Throws error!
      System.out.println(t1);
      System.out.println(t1.getArea()); 
      System.out.println(t1.getPerimeter()); 
      System.out.println(t1.getColor());

   }
}