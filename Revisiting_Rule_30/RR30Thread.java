/**
 * Created by USER on 12/3/2016.
 */
public class RR30Thread extends Thread{

    int start;
    int end;
    int[] prevArr;
    int[] presArr;
    int arrsize;

    public RR30Thread(int start, int end, int[] prevArr, int arrsize) {
        this.start = start;
        this.end = end;
        this.prevArr = prevArr;
        presArr = new int[end - start];
        this.arrsize = arrsize;
    }
    public void run() {
        int prevLeft, prevRight;
        int j = 0;
        for (int i = start; i < end; i++) {
            if (i == 0) {
                prevLeft = 0;
                presArr[j] = rule(prevLeft, prevArr[i], prevArr[i + 1]);
            } else if (i == arrsize - 1) {
                prevRight = 0;
                presArr[j] = rule(prevArr[i - 1], prevArr[i], prevRight);
            }
            else {
                presArr[j] = rule(prevArr[i - 1], prevArr[i], prevArr[i + 1]);
            }
            j = j + 1;
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

    public int[] getOutput() {
        return presArr;
    }
}
