import java.util.Scanner;

public class Primefactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 2;
        while(n != 1){
    
            while(n % div == 0){
                System.out.print(div+" ");
                n = n / div;
           }
           div++;
        }
    }
    
}
