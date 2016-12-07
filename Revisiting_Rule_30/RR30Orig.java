/**
 * Created by USER on 12/8/2016.
 */
import java.util.Scanner;
public class RR30Orig {
    public static void display (int size){
        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();*/
        int seed = size / 2, prevLeft, prevRight;
        int[] prevArr;
        prevArr = new int[size];
        int[] presArr;
        presArr = new int[size];
        for (int i = 0; i < size; i++) {
            if(i != seed) {
                System.out.print(0);
                prevArr[i] = 0;
            } else {
                System.out.print(1);
                prevArr[i] = 1;
            }
        } System.out.println();
        for (int t = 1; t < size; t++) {
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    prevLeft = 0;
                    presArr[i] = rule(prevLeft, prevArr[i], prevArr[i + 1]);
                } else if (i == size - 1) {
                    prevRight = 0;
                    presArr[i] = rule(prevArr[i - 1], prevArr[i], prevRight);
                } else {
                    presArr[i] = rule(prevArr[i - 1], prevArr[i], prevArr[i + 1]);
                }
            } for (int i = 0; i < size; i++) {
                System.out.print(presArr[i]);
                prevArr[i] =  presArr[i];
            } System.out.println();
        }
    }
    public static int rule(int prevLeft, int prevMiddle, int prevRight) {
        int[] origArray = {0, 0, 0, 1, 1, 1, 1, 0};
        if ((prevLeft == 1 && prevMiddle == 1 && prevRight == 1) || (prevLeft == 1 && prevMiddle == 1 && prevRight == 0) || (prevLeft == 1 && prevMiddle == 0 && prevRight == 1) || (prevLeft == 0 && prevMiddle == 0 && prevRight == 0)) {
            return 0;
        } else if ((prevLeft == 1 && prevMiddle == 0 && prevRight == 0) || (prevLeft == 0 && prevMiddle == 1 && prevRight == 1) || (prevLeft == 0 && prevMiddle == 1 && prevRight == 0) || (prevLeft == 0 && prevMiddle == 0 && prevRight == 1)) {
            return 1;
        } return 0;
    }
}
