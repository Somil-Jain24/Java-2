import java.util.*;
public class gcd_lcm {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Numbers :- ");
        int p = s.nextInt();
        int q = s.nextInt();
        int a = p;
        int b = q;
        while(p !=0){
           int r = q % p;
            q=p;
            p=r;         
        }
        System.out.println("GCD is :" + q);

        System.out.println("LCM is :" + (a*b)/q);
    }
}
