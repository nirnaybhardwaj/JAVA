import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i < row; i++) {
                int t = i;
                int rev = 0;
                while(i > 0){
                    int r = i % 10;
                    rev = rev * 10 + r;
                    i = i / 10;
                }
                if(rev == t){
                    System.out.print(rev+"\t");
                }
            }
            System.out.println();
        }
    }
    
}
