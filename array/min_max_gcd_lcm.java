import java.util.*;

public class min_max_gcd_lcm {
    public static void min_max(int[] arr , int n){
        int max = arr[0];
        int min = arr[0];
        
       
        for(int i = 0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        gcd_lcm(min, max);
    }

    public static void gcd_lcm(int a , int b){
        int m = a;
        int n = b;

       
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (m * n) / gcd;

        System.out.println("GCD is : " + gcd);
        System.out.println("LCM is : " + lcm);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        min_max(arr, n);
    }
}
