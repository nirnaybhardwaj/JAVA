package Functions.Array;

import java.util.Scanner;

public class Span_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            

            if(arr[i] > arr[i + 1]){
                max = arr[i];
            }
            else{
                max = arr[i + 1];
            }
        }
        System.out.println(max);
        // for (int j = 0; j < arr.length; j++) {
        //     System.out.print(arr[j] + " ");    
        // }
        // System.out.println();
    }
    
}
