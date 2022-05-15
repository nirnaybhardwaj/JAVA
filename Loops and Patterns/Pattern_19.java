import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Enter Again !!!");
        } else {

            for (int row = 1; row <= n; row++) {

                for (int col = 1; col <= n; col++) {
                    if (row == 1 && col > n / 2 + 1 && col < n) {
                        System.out.print("\t");
                    } else if (row > 1 && row < n / 2 + 1 && col != n / 2 + 1 && col != n) {
                        System.out.print("\t");
                    } else if (row > n / 2 + 1 && row < n && col != 1 && col != n / 2 + 1) {
                        System.out.print("\t");
                    } else if (row == n && col > 1 && col < n / 2 + 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                }

                System.out.println();
            }
        }

    }

}
