package Functions.Array;

import java.util.Scanner;

public class Element_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(d == arr[i]){
                
                System.out.println(i);
                return;
            }    
        }
        System.out.println("-1");
    }
    
}
