import java.util.*;

public class digit_frequency {
    public static int digit(long n, int f) {
        int count = 0;
        while (n != 0) {
            if (n % 10 == f) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int f = s.nextInt();
        System.out.println("Frequency of Digit : " + digit(n, f));
    }
}