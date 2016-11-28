import java.util.Scanner;
public class mp1_5{
	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int seed = size / 2;
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
					int left = 0;
					presArr[i] = rule(left, prevArr[i], prevArr[i + 1]);
				} else if (i == size - 1) {
					int right = 0;
					presArr[i] = rule(prevArr[i - 1], prevArr[i], right);
				} else {
					presArr[i] = rule(prevArr[i - 1], prevArr[i], prevArr[i + 1]);
				}
			} for (int i = 0; i < size; i++) {
				System.out.print(presArr[i]);
				prevArr[i] =  presArr[i];
			} System.out.println();
		}
	}
	public static int rule(int left, int middle, int right) {
		int[] origArray = {0, 0, 0, 1, 1, 1, 1, 0};
		if (left == 1 && middle == 1 && right == 1) { return origArray[0];}
		else if (left == 1 && middle == 1 && right == 0) { return origArray[1];}
		else if (left == 1 && middle == 0 && right == 1) { return origArray[2];}
		else if (left == 1 && middle == 0 && right == 0) { return origArray[3];}
		else if (left == 0 && middle == 1 && right == 1) { return origArray[4];}
		else if (left == 0 && middle == 1 && right == 0) { return origArray[5];}
		else if (left == 0 && middle == 0 && right == 1) { return origArray[6];}
		else if (left == 0 && middle == 0 && right == 0) { return origArray[7];}
		return 0;
	}
}