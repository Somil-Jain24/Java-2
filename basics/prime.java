import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        // System.out.println("Total number you want to find :- ");
        // int t = s.nextInt();
        // System.out.println("Write all numbers : ");
        // for(int i=1; i<=t;i++){
            System.out.println("Enter Number :");
            int n = s.nextInt();

            int count = 0;
            for(int div = 2;div*div <=n ; div++ ){
                if(n%div ==0){
                    count++;
                    break;
                }

            }
            if(count == 0){
                System.out.println( n +" Is Prime ");
            }
            else
            System.out.println( n +" is Not Prime");
        // }
    }
}