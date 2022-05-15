import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int space = n / 2;
        // int star = 1;

        // for (int row = 1; row <= n; row++) {
        // if(row != n / 2 + 1){
        // for (int i = 1; i <= space; i++) {
        // System.out.print("\t");
        // }
        // }else{
        // for (int i = 1; i <= space; i++) {
        // System.out.print("*\t");
        // }
        // }

        // for (int i = 1; i <= star; i++) {
        // System.out.print("*\t");
        // }
        // if(row <= n / 2){
        // star++;
        // }else{
        // star--;
        // }
        // System.out.println();
        // }

        // 2nd Method

        int space = n / 2;
        int star = 1;

        for (int row = 1; row <= n; row++) {
            if (row == n / 2 + 1) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("*\t");
                }
            }else{
                for (int i = 1; i <= space; i++) {
                    System.out.print("\t");
                }
                for (int i = 1; i <= star; i++) {
                    System.out.print("*\t");
                }
            }
            

            if (row <= n / 2) {
                star++;

            } else {
                star--;

            }

            System.out.println();

        }
    }

}
