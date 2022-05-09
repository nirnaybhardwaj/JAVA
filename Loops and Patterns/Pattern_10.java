import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int isp = -1;
        int osp = n / 2;
        
        for (int row = 1; row <= n; row++) {
            
            for (int i = 1; i <= osp; i++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int i = 1; i <= isp; i++) {
                System.out.print("\t");
            }
            if(row != 1 && row != n){
                System.out.print("*\t");
            }
            if(row <= n / 2){
                isp +=2;
                osp--;

            }else{
                isp -=2;
                osp++;
            }
            System.out.println();
        }
    }
}
