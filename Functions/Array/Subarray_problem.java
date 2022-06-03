// package Functions.Array;

import java.util.Scanner;

public class Subarray_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        // 1st METHOD

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {

        // for (int j2 = i; j2 <= j; j2++) {
        // System.out.print(arr[j2] + "\t");
        // }
        // System.out.println();
        // }
        // }
        // }

        // 2ND METHOD not in use 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = i; j < arr.length; j++) {
                str+= arr[j] + "\t";
                System.out.println(str);
            }
        }
    }

}
