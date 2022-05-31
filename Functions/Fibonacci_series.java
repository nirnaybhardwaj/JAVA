import java.util.Scanner;


/**
 * Fibonacci_series
 */
public class Fibonacci_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        Print_fibonacii_till_n(5);
        Print_fibonacii_till_n(9);

    }
    static void Print_fibonacii_till_n(int n){
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }
    }
}