
/**
 * Created by USER on 12/3/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RR30 {
    public static final int THREAD_COUNT = 4;

    public static void display (int size) {
        int seed = size / 2;

        //initialize or draw first the first row of the 2d array with seed at index size/2 -1
        int[] prevArr = new int[size];
        int[] presArr = new int[size];
        for (int i = 0; i < size; i++) {
            if(i != seed) {
                System.out.print(0);
                prevArr[i] = 0;
            } else {
                System.out.print(1);
                prevArr[i] = 1;
            }
        } System.out.println();
        int tc;
        if(size < THREAD_COUNT) {
            tc = size;
        }
        else {
            tc = THREAD_COUNT;
        }
        int max = size % tc;
        RR30Thread[] worker = new RR30Thread[tc];
        int boxesPerWorker = size / tc;

        for (int t = 1; t < size; t++) {
            int start = 0;
            int end = 0;
            for (int i = 0; i < tc; i++) {

                if (i == tc - 1) {
                    end = size;//start + boxesPerWorker + max;

                    worker[i] = new RR30Thread(start, end, prevArr, size);
                    start = start + end;
                }

                else {
                    end  = start + boxesPerWorker;
                    worker[i] = new RR30Thread(start, end, prevArr, size);
                    start = end;
                }

            }
            for (int i = 0; i < tc ; i++) {
                worker[i].start();
            }
            for (int i = 0; i < tc ; i++) {
                while (worker[i].isAlive()) {
                    try {
                        worker[i].join();
                    } catch (InterruptedException e) {
                        System.err.println("thread interrupted: " + e.getMessage());
                    }
                }
            }
            int indArr = 0;

            for (int i = 0; i < tc; i++) {
                int[] port;
                if (i == tc - 1) {
                    port = new int[max];
                    port = worker[i].getOutput();
                    for (int j = 0; j < max - size; j++) {
                        presArr[indArr] = port[j];
                        indArr++;
                    }
                }
                else {
                    port = new int[boxesPerWorker];
                    port = worker[i].getOutput();
                    for (int j = 0; j < boxesPerWorker; j++) {
                        presArr[indArr] = port[j];
                        indArr++;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                prevArr[i] = presArr[i];
                System.out.print(presArr[i]);
            }
            System.out.println();
        }
    }
}
