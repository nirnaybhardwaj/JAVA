package Functions;

import java.util.Scanner;

public class Any_base_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sourceBase = sc.nextInt();
        int  destBase= sc.nextInt();

        int decimal = anyBasetoDecimal(n, sourceBase);
        int ans = decimalToAnyBase(decimal, destBase);
        System.out.println(ans);

        
    }
    public static int anyBasetoDecimal(int n, int b){

        int ans1 = 0;
        int count = 0;

        while(n > 0){
            int r = n % 10;
            ans1 = ans1 + r * (int)Math.pow(b , count);
            count++;
            n = n / 10;
        }
        return ans1;
    }
    public static int decimalToAnyBase(int n, int b){

        
        int ans2 = 0;
        int count = 0;

        while(n > 0){
            int r = n % b;
            ans2 = ans2 + r * (int)Math.pow(10, count);
            count++;
            n = n / b;
        }
        return ans2;
    }
    
    
}
