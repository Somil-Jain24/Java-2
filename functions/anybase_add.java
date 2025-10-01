
import java.util.*;

public class anybase_add {

    public static int convert(int n1, int n2 , int b) {
        int d = 1;
        int p = 0;
        int q = 0;
        while (n1 != 0 || n2 !=0 || p!=0) {
        int r1 = n1%10;    
        int r2 = n2%10;
        int a = r1+r2+p;
         q = q + (a%b)*d;
        d = d*10;
        p = a/b;
        n1 = n1 / 10;
        n2 = n2 / 10;
        }
        return q;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first and second number : ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("Enter base : ");
        int b = s.nextInt();
        
        System.out.println("converted number is : " + convert(n1,n2, b));

    }
}
