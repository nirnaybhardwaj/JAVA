import java.util.Scanner;

public class is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();

            int count = 0;
            for(int j = 2; j < n; j++){
                if(n % j == 0){
                    count++;
                }
            }
            if(count > 0){
                System.out.println("not prime");
            }else {
                System.out.println("prime");
            }
        }

        // 2ND METHOD :OPTIMIZED METHOD


        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();

            int count = 0;
            for(int j = 2; j * j <= n; j++){
                if(n % j == 0){
                    count++;
                }
            }
            if(count > 0){
                System.out.println("not prime");
            }else {
                System.out.println("prime");
            }
        }

    }
}
