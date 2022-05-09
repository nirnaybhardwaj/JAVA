import java.util.Scanner;

public class Pattern_4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for (int row = 1; row <= n; row++) {
           int space = row - 1;
           int count = (n + 1) - row;
           for (int i = 1; i <= space; i++) {
               System.out.print("\t");
           }
           for (int i = 1; i <= count; i++) {
               System.out.print("*\t");
           }
           System.out.println();
       }

       //  2nd method

    //    for (int row = n; row >= 1; row--) {
    //     int space = n - row;
    //     int count = row;
    //     for (int i = 1; i <= space; i++) {
    //         System.out.print("\t");
    //     }
    //     for (int i = 1; i <= count; i++) {
    //         System.out.print("*\t");
    //     }
    //     System.out.println();
    // }
   } 
}
