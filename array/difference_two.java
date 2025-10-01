import java.util.*;

public class difference_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of 1st and 2nd array : ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        System.out.println("Enter first array element : ");
        for (int i = 0; i < n1; i++) {
            a1[i] = s.nextInt();
        }
        System.out.println("Enter second array element : ");
        for (int i = 0; i < n2; i++) {
            a2[i] = s.nextInt();
        }

        int[] diff = new int[n2];
        int c = 0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;
    
        while(k>=0){
            int d =0;
            int a1v = i >= 0 ? a1[i] : 0;
            if(a2[j] + c >= a1v){
                d = a2[j] + c - a1v;
                c = 0;
            } else{
                d = a2[j]+c+10 - a1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;

               
        }
        for ( int val : diff){
            System.out.print(val + " ");
        }
    }
}
