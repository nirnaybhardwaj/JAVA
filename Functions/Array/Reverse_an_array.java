package Functions.Array;

import java.util.Scanner;

public class Reverse_an_array {
    public static void main(String[] args) {

        // BRUTE METHOD (NOT IN USE)

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int[] temp = new int[n];
        // for (int j = 0; j < arr.length; j++) {
        // temp[n-1-j] = arr[j];
        // }
        // for (int j2 = 0; j2 < temp.length; j2++) {
        // arr[j2] = temp[j2];
        // }
        // for (int k = 0; k < arr.length; k++) {
        // System.out.print(arr[k]+" ");
        // }
        // System.out.println();

        // OPTIMIZED METHOD(TWO POINTER APPROACH)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a) {
        // write your code here
        int a1 = 0;
        int a2 = a.length - 1;

        while (a1 <= a2) {
            int temp = a[a1];
            a[a1] = a[a2];
            a[a2] = temp;

            a1++;
            a2--;
        }
        
    }

}
