/**
 * Created by USER on 12/8/2016.
 */
public class RR30Main {
    public static void main(String args[]) throws Exception{
        long startTime;
        long endTime;
        long threadedDuration;
        long nonThreadedDuration;
        int gridSize = 5000;

        //nonthreaded
        startTime = System.currentTimeMillis();
        RR30Orig.display(gridSize);
        endTime = System.currentTimeMillis();
        nonThreadedDuration = endTime - startTime;

        System.out.println();

//		threaded;
        startTime = System.currentTimeMillis();
        RR30.display(gridSize);
        endTime = System.currentTimeMillis();
        threadedDuration = endTime - startTime;


        System.out.println();


        System.out.println("Threaded): " + threadedDuration + "ms");
        System.out.println("Sequential: " + nonThreadedDuration + "ms");

    }
}
