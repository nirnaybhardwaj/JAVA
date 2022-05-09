import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int count = 0;
        // for (int i = 2; i < n; i++) {
        //     if(n % i == 0){
        //         count++;
        //     }
        // }
        // if(count > 0){
        //     System.out.println("not prime no.");
        // }else{
        //     System.out.println("prime no.");
        // }

        // 2ND METHOD OPTIMIZED METHOD

        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("not prime no.");
        }else{
            System.out.println("prime no.");
        }
    }
}
