import java.util.Scanner;

public class Inverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int position = 1;
        int inverse = 0;
        while(n > 0){
            int digit = n % 10;
            int inverse_position = digit;
            int inverse_digit = position;
            inverse = inverse + inverse_digit * (int)Math.pow(10, inverse_position - 1);

            position++;
            n = n / 10;
        }
        System.out.println(inverse);
    }
}
