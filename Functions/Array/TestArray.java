package Functions.Array;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        
        // int[] arr = new int[5];

        // // System.out.println(arr[0]);

        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 4;
        // arr[3] = 90;
        // arr[4] = 78;
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");    
        }
        System.out.println();
    }
    
}
