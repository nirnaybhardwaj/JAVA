package Functions;

import java.util.Scanner;

public class Any_base_to_subtraction {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
  
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
    public static int getDifference(int b, int n1, int n2){
        
        int borrow = 0;
        int ans = 0;
        int count = 0;

        while(n1 != 0 || n2 != 0){
            int r1 = n2 % 10;
            int r2 = n1 % 10;

            r1 = r1 - borrow;

            if(r1 < r2){
                borrow = 1;
                r1 = r1 + b;
            }
            else{
                borrow = 0;
            }
            int diff = r1 - r2;
            
            n1 = n1 / 10;
            n2 = n2 / 10;

            ans = ans + diff *(int)Math.pow(10, count);
            count++;

        }
        return ans;
    }
    
}
