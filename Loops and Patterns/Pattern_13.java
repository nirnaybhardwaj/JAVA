import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for (int row = 0; row < n; row++) {

        // for (int col = 0; col <= row; col++) {
        // int r = 1;
        // int c = 1;
        // int d = 1;
        // for (int i = row; i > 0; i--) {
        // r = r * i;
        // }
        // for (int i = col; i > 0; i--) {
        // c = c * i;
        // }
        // for (int i = row - col; i > 0; i--) {
        // d = d * i;
        // }

        // int ans = r / (c * d);
        // System.out.print(ans + "\t");
        // }

        // System.out.println();
        // }

        // 2nd method by using property

        for (int row = 0; row < n; row++) {
            int val = 1;

            for (int col = 0; col <= row; col++) {
                System.out.print(val + "\t");
                int nextVal = (val * (row - col)) / (col + 1);
                val = nextVal;
            }

            System.out.println();
        }

    }

}
