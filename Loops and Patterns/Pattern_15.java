import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;
        int space = n / 2;
        int count = 1;

        for (int row = 1; row <= n; row++) {
            int t = val;

            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= count; i++) {
                System.out.print(t +"\t");
                if(i <= count / 2){
                    t++;
                }else{
                    t--;
                }
                
            }
            if(row <= n / 2){
                space--;
                count +=2;
                val++;
            }
            else{
                space++;
                count -=2;
                val--;
            }
            
            System.out.println();
        }
    }
    
}
