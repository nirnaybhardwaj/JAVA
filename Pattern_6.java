import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n / 2 + 1;
        int space = 1;

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= star; i++) {
                System.out.print("*\t");
            }
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= star; i++) {
                System.out.print("*\t");
            }
            if(row <= n / 2){
                star--;
                space += 2;
            }else{
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
}
