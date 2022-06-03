package Functions.Array;
import java.io.*;
import java.util.*;

public class Rotate_an_array {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    
      public static void rotate(int[] a, int k){
        // write your code here
        int length = a.length;
        k = k % length;
        if(k <0){
            k = k + length;
        }
        reverse(a, 0, length - k - 1);
        reverse(a, length - k, length - 1);      
        reverse(a, 0, length - 1);

      }
      public static void reverse(int[] a, int a1, int a2) {

        while (a1 <= a2) {
            int temp = a[a1];
            a[a1] = a[a2];
            a[a2] = temp;

            a1++;
            a2--;
        }
        
    }

}
