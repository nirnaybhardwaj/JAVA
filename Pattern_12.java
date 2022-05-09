import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int row = 1; row <= n; row++) {
            int count = row;
            for (int i = 1; i <= count; i++) {
                    System.out.print(a+"\t");
                    int c = a + b;
                    a = b;
                    b = c;   
            }
            System.out.println();
        }
    }
    
}
