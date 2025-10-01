import java.util.*;
public class countdigit {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.println("Enter Digit : ");
        int n = s.nextInt();
        int t =0;
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }

        System.out.println("Count : " + count);

    }
}