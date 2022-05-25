package Functions;

import java.util.Scanner;

public class Any_value_to_decimal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
    public static int getValueIndecimal(int n, int b){
        
        int ans = 0;
        int count = 0;
        while(n > 0){
            int r = n % 10;
            ans = ans + r * (int)Math.pow(b, count);
            count++;
            n = n / 10;
        }
        return ans;
     }
}
