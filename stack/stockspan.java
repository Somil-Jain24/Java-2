import java.util.*;
public class stockspan {
    public static int[] stock(int[] arr){
        int[] span = new int[arr.length];
        span[0]=1;
        Stack<Integer> st = new Stack<>();
        for(int i = 1; i<arr.length;i++){
            while(st.size > 0 && arr[i] > arr[st.peek()] ){
                
            }
        }
    }
}
