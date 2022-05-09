import java.util.Scanner;

class Pattern_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int count = row;
            for (int i = 1; i <= count; i++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}