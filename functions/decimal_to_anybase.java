import java.util.*;
public class decimal_to_anybase {
    public static int convert(int n , int b){
        int div = 0;
        int p = 1;
        while(n!=0){
            int r = n%b;
            div = div + r *p;
            p = p*10;
            n = n /b;
        }
        return div;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter decimal base number : ");
        int n = s.nextInt();
        System.out.println("Enter converted base : ");
        int b = s.nextInt();
        System.out.println("converted number is : " + convert(n, b));

    }
}
