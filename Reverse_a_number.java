import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0){
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }

        //2nd METHOD

         int length = 0;
         int t = n;

         while(n > 0){
             length++;
             n = n / 10;
         }
         n = t;
        int power = (int)Math.pow(10, length - 1);

        int rev = 0;
        while(n > 0){
            int r = n % 10;
            rev = rev + r * power;

            power = power / 10;
            n = n / 10;
        }
        System.out.println(rev);


        //3RD METHOD

//        int rev = 0;

        while(n > 0){
            int r = n % 10;
            rev = rev * 10 + r;

            n = n / 10;
        }
        System.out.println(rev);

    }
}
