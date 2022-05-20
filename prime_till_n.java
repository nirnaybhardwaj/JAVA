import java.util.Scanner;

public class prime_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low; i <= high; i++){
            int count = 0;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
//            if(count > 0){
//                System.out.println("not prime");
//            }else{
//                System.out.println("prime");
//            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
