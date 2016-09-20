/**
* created by @ann_icel on 9/14/16
*/


/*
 * A Test Driver for the Date class.
 */
public class TestDate {
   public static void main(String[] args) {
      // Test constructor and toString()
      Date d1 = new Date(2016, 4, 6);
      System.out.println(d1);  // toString()
 
      // Test Setters and Getters
      d1.setYear(2000);
      d1.setMonth(2);
      d1.setDay(29);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());
 
      // Test setDate()
      d1.setDate(2008, 1, 2);
      System.out.println(d1);  // toString()
      Date d2 = new Date(2008, 2, 29);
      System.out.println(d2);
      Date d3 = new Date(2008, 2, 30);
      System.out.println(d3);
      Date d4 = new Date(2009, 2, 28);
      System.out.println(d4);
      Date d5 = new Date(2009, 2, 29);
      System.out.println(d5);
      Date d6 = new Date(2009, 12, 31);
      System.out.println(d6);
      Date d7 = new Date(2008, 12, 32);
      System.out.println(d7);
      Date d8 = new Date(2008, 11, 30);
      System.out.println(d8);
      Date d9 = new Date(2008, 9, 31);
      System.out.println(d9);
      Date d10 = new Date(2008, 7, 31);
      System.out.println(d10);
      Date d11 = new Date(2008, 7, 32);
      System.out.println(d11);
      Date d12 = new Date(1900, 2, 30);
      System.out.println(d12);

   }
}