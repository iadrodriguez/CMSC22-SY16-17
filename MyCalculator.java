import java.util.*;

class MyCalculator {

    int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
          
        return (p == 0) ? 1 : n*power(n,p-1);
    }
}//by iadRodriguez on 11/08/16
class Solution {
    
	public static void main(String []args) {
        // Write your code here.  
        Scanner sc = new Scanner(System.in);
        MyCalculator mc = new MyCalculator();
        while(sc != null) {
            int base = sc.nextInt();
            int exponent = sc.nextInt();
            try {
                System.out.println(mc.power(base, exponent));
            }
            catch (Exception e) {
                System.out.println("java.lang.Exception: " + e.getMessage());
            }
        }
    }
}