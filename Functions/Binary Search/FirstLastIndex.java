import java.util.Scanner;


public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        int ans1 = first_index(arr, d);
        int ans2 = last_index(arr, d);
        System.out.println(ans1);
        System.out.println(ans2);

        
    }
    public static int first_index(int [] arr, int d){
        int left = 0;
        int right = arr.length - 1;

        int save = -1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] > d){
                right = mid - 1;
            }
            else if(arr[mid] < d){
                left = mid + 1;
            }
            else if(arr[mid] == d){
                save = mid;
                right = mid - 1;
                
            }
        }
        return save;
    }
    public static int last_index(int [] arr, int d){
        int left = 0;
        int right = arr.length - 1;

        int save = -1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] > d){
                right = mid - 1;
            }
            else if(arr[mid] < d){
                left = mid + 1;
            }
            else if(arr[mid] == d){
                save = mid;
                left = mid + 1;
                
            }
        }
        return save;
    }
    
}
