import java.util.Scanner;

public class digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int count = 0;

        while(n > 0){
            n  = n / 10;
            count++;
        }
        n = t;
        int div = (int)Math.pow(10, count - 1);

        while(div > 0) {
            int d = n / div;
            System.out.println(d);

            n = n % div;
            div = div / 10;
        }
    }
}
