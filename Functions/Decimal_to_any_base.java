package Functions;

import java.util.Scanner;

public class Decimal_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        

            //1st METHOD agar agee 0 agai to galat chlega code (not optimized code)

        // int ans = 0;
        // int ans1 = 0;
        // while (n > 0) {

        //     int r = n % b;
        //     ans = ans * 10 + r;
        //     n = n / b;

        // }
        
        
        // while(ans > 0){
        //     int r1 = ans % 10;
        //     ans1 = ans1 * 10 + r1;
        //     ans = ans / 10;
        // }
        // return ans1;


        // 2nd METHOD (optimized code)

        int ans = 0;
        int count = 0;
        while (n > 0) {

            int r = n % b;
            ans = ans +r * (int)Math.pow(10, count);
            count++;
            n = n / b;

        }
        return ans;
    }
}
