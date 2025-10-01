import java.util.*;
public class rotate_array {

    public static void rotate(int arr[] , int n ,int r){
         int i = 0;
        int j = r;
        while(j<n){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        for (int k = 0; k < n; k++) {
          System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter index that you want to rotate (+ve for right, -ve for left): ");
        int r = s.nextInt();

         r = r % n;      
        if(r < 0){      
            r = r + n;
        }
        rotate(arr, n, r);
       
    }
}
