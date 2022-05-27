package Functions;

import java.util.Scanner;

public class Any_base_to_multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    public static int getProduct(int b, int n1, int n2){
        int ans = 0;
        int mul = 1;

        while(n2 != 0){
            int r2 = n2 % 10;

            int curr = getProductWithSingleDigit(b, n1, r2) * mul;
            mul *= 10;

            ans = getSum(b, ans, curr);
            n2 = n2 / 10;
        }
        return ans;
    }
    public static int getProductWithSingleDigit(int b, int n1, int r2){
        
        int c = 0;
        int count = 0;
        int ans = 0;
        while ( n1 != 0 || c != 0){
            int r1 = n1 % 10;
            
                
            int mul = r1 * r2 + c;
            int digit = mul % b;
            c = mul / b;

            n1 = n1 / 10;

            ans = ans + digit * (int)Math.pow(10, count);
            count++;
        }
        return ans;
    }
    public static int getSum(int b, int n1, int n2){
        int ans = 0;
        int c = 0;
        int count = 0;
        while(n1 != 0 || n2 != 0|| c != 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            int add = r1 + r2 + c;
            int digit = add % b;
            c = add / b;

            n1 = n1/ 10;
            n2 = n1 / 10;

            ans = ans + digit * (int)Math.pow(10, count);
            count++;
        }
        return ans; 
    }
    
}
