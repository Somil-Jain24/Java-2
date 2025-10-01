import java.util.*;
public class printdigit {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.println("Enter Digit : ");
        int n = s.nextInt();
        int count = 0;
        int temp =n;
        while(n!=0){
            n = n/10;
            count++;
        }
        int div = (int)Math.pow(10, count-1);

        while(temp !=0){
           int t = temp /div;
           System.out.println(t);
           temp = temp % div ;
           div = div/10;
        }

    }
}