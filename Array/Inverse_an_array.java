package Functions.Array;
import java.io.*;
import java.util.*;

public class Inverse_an_array {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }
    
      public static int[] inverse(int[] a){
        // write your code here
        int n = a.length;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = i;
            int val = a[i];

            ans[val] = idx;
        }
        return ans;
      }

}
