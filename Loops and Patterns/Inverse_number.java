import java.util.Scanner;

public class Inverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int position = 1;
        int inverse = 0;
        while(n > 0){
            int d = n % 10;
            int inv_position = d;
            int inv_digit = position;
            
            inverse = inverse + inv_digit * (int)Math.pow(10, inv_position - 1);

            position++;
            n = n / 10;
        }
        System.out.println(inverse);
    }
}
