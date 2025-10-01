import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Number : ");
        int n = s.nextInt();
        System.out.println("Enter number that you want to rotate (+ve for right, -ve for left): ");
        int r = s.nextInt();
        
        int count = 0;
        int temp = n;
        
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        
        r = r % count;      
        if(r < 0){      
            r = r + count;
        }
        
        int t = (int)Math.pow(10, r);
        int a = (int)Math.pow(10, (count - r));
        
        int q = (n % t) * a;
        n = n / t;
        
        System.out.println("Rotated Number: " + (q + n));
    }
}
