
import java.util.*;

public class anybase_to_anybase {

    public static int convert(int n, int b , int q) {
        int div = 0;
        int p = 1;
        while (n != 0) {
            int r = n % q;
               if (r >= b) {
                throw new IllegalArgumentException("Invalid digit " + r + " for base " + b);
            }
            div = div + r * p;
            p = p * b;
            n = n / q;
        }
        return div;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = s.nextInt();
        System.out.println("Enter base : ");
        int b = s.nextInt();
        System.err.println("Enter Converted base : ");
        int q = s.nextInt();

        System.out.println("converted number is : " + convert(n, b , q));

    }
}
