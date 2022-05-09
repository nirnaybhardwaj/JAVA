import java.util.Scanner;

public class Rotate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = n;


        int length = 0;

        while(n > 0){
            length++;
            n = n / 10;
        }
        n = t;

        k = k % length;
        if(k < 0){
            k = k + length;
        }

        int div = (int)Math.pow(10, k);
      
        int a = n % div;
        int b = n / div;
        int rotate = a * (int)Math.pow(10, length - k) +  b;
        System.out.println(rotate);
    }
    
}
