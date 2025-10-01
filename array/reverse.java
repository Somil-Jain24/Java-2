import java.util.*;
public class reverse {
    public static void rev(int arr[] ,int n){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
          System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        rev(arr, n);
        
        
    }
}
