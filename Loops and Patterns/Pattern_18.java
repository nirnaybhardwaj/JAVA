import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 0;
        int star = n;

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }

            for (int i = 1; i <= star; i++) {
                if (row > 1 && row < n / 2 + 1 && i > 1 && i < star) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (row <= n / 2) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }

            System.out.println();
        }
    }

}
