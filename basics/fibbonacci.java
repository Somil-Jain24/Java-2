import java.util.*;
public class fibbonacci{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = s.nextInt();
        int a = 0 ;
        int b =1;
        int t1 =0 , t2 = 0 ;
        // for (int i = 2;i<=n;i++){
        //     t1 = a+b;
        //     a = b;
        //     b = t1;
            
        // }
        //     if(n == 0){
        //     System.out.println("0");
        // } 
        // else if( n==1){
        //     System.out.println("1");
        // }
        // else
        // System.out.println("Answer By FOR loop is : " + t1 );

    
        
        int count = 0;
        while(count <= n){
            System.out.print(a +" ");
            t2 = a+b;
            a = b;
            b = t2;
            count ++;
            
        }
        //     if(n == 0){
        //     System.out.println("0");
        // } 
        // else if( n==1){
        //     System.out.println("1");
        // }


    }
}