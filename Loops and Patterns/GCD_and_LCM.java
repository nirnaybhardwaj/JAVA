import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1;
        int b  = num2;

        while (num1  != 0){
            int r = num2 % num1;
            num2 = num1;
            num1 = r;
        }
        int gcd = num2;
        num1 = a;
        num2 = b;

        
        int lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
    
}
