import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int space = n - 1;

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= star; i++) {
                System.out.print("*\t");
            }
                
            space--;
            
            System.out.println();
        }
    }
    
}
