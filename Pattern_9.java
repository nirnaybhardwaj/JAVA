import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int o_sp = 0;
        int i_sp = n - 2;
        

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= o_sp; i++) {
                System.out.print("\t");
            }
            
            System.out.print("*\t");
            
            for (int i = 1; i <= i_sp; i++) {
                System.out.print("\t");
            }

            if(row != n / 2 + 1){
                System.out.print("*\t");
            }

            if(row <= n / 2){
                o_sp++;
                i_sp -=2;
            }else{
                o_sp--;
                i_sp +=2;
            }
            System.out.println();
        }
    }
    
}
