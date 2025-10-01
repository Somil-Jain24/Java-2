import java.util.Scanner;

public class n_prime {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        // int n = s.nextInt();
        System.out.println("Enter Lower And Higher Limit : ");
        int low = s.nextInt();
        int high = s.nextInt();
        int c =0;

        for(int i = low; i<= high ; i++ ){
            int count = 0;
            for(int div = 2;div*div <=i ; div++ ){
                if(i%div ==0){
                    count++;
                    break;
                }

            }
            if(count == 0){
                System.out.println( i );
                c++;
            }
           
        }
        System.out.println("Total Prime Numbers Are : " + c );
    }
}
