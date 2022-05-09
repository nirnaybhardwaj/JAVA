import java.util.Scanner;

public class Benjamin_bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1ST METHOD NOT OPTIMIZED

        // for (int i = 1; i <= n; i++) {
        //     int count = 0;
        //     for (int j = 1; j <= i; j++) {
        //         if(i % j == 0){
        //             count++;
        //         }
                
        //     }
        //     if(count % 2 != 0){
        //         System.out.println(i);
        //     }
        // }


        //2ND METHOD OPTIMIZED METHOD

        
        int i = 1;
        while( i * i <= n){
            System.out.println(i * i);
            i++;
        }
    }
    
}
