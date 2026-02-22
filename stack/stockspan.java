import java.util.*;

public class stockspan {
    public static int[] stock(int[] arr) {
        int[] span = new int[arr.length];
        span[0] = 1;
        Stack<Integer> st = new Stack<>();
        st.push(0);0vfighj'/*-1?.       for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else
                span[i] = i - st.peek();

            st.push(i);
        }
        return span;

    }



    public static void main(String[] args) {
        int[] arr = {5,1,7,8,3,6};
        int[] temp = stock(arr);
        for(int i : temp){
            System.out.print(i + " ");  
        }
    }
}
