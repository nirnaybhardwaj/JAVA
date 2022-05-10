import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;

        for (int row = 1; row <= n; row++) {
            int count = row;
            
            for (int i = 1; i <= count; i++) {
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
        }
    }
    
}
