package Functions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int c = 0;
        int count = 0;
        int ans = 0;
        while ( n2 != 0){
            int r2 = n2 % 10;
            // int ans1 = 0;
            while(n1 != 0){
                int r1 = n1 % 10;
                int mul = r1 * r2 + c;
                int digit = mul % b;
                c = mul / b;

                n1 = n1 / 10;

                ans = ans + digit * (int)Math.pow(10, count);
            }
            
            n2 = n2 / 10;

        }
        
        System.out.println(ans);

    }
    
}
