import java.util.*;
public class inverse{
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.println("Enter Digit : ");
        int n = s.nextInt();
        int t =0;
        int count = 0;
         while(n!=0){
            int p = n%10;
            count++;
            
           t = t + count * (int)Math.pow(10, p-1);
            
            n = n/10;

        }
        System.out.println(t);


      
    }
}