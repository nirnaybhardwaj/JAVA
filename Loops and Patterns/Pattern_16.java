import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalCol = 2 * n - 1;

        // int totalElement = 2 * row;

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= row; i++) {
                System.out.print(i + "\t");
            }

            int space = totalCol - 2 * row;

            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            // if (row == n) {
            // for (int i = row - 1; i >= 1; i--) {
            // System.out.print(i + "\t");
            // }
            // } else {
            // for (int i = row; i >= 1; i--) {
            // System.out.print(i + "\t");
            // }
            // }

            int save = row;
            if (save == n)
                save--;
            for (int i = save; i >= 1; i--) {
                System.out.print(i + "\t");
            }

            System.out.println();
        }
    }

}
