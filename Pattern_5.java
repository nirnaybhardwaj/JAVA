import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n / 2;
            int star = 1;

        for (int row = 1; row <= n; row++) {
            
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= star; i++) {
                System.out.print("*\t");
            }
            
            if(row <= n / 2){
                space--;
                star +=2;
            }else{
                space++;
                star -=2;
            }           
            System.out.println();
        }
    }
}
