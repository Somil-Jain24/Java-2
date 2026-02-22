import java.util.Stack;

public class large_rectangle_histrogram {
    public static void check(int[] arr){
        int[] rb = new int[arr.length];
        Stack<Integer> st1 = new Stack<>();
        // st1.push(arr.length-1);
        // rb[arr.length-1] = -1;
        for(int i = arr.length-1; i>=0 ;i--){
            while (!st1.isEmpty() && arr[st1.peek()] >= arr[i]) {
                st1.pop();
            }
            rb[i] = st1.isEmpty() ? arr.length : st1.peek();
            st1.push(i);
        }

        int[] lb = new int[arr.length];
        Stack<Integer> st2 = new Stack<>();
        // st2.push(0);
        // lb[0] = -1;

        for(int i = 0; i<arr.length ;i++){
            while (!st2.isEmpty() && arr[st2.peek()] >= arr[i]) {
                st2.pop();
            }
            lb[i] = st2.isEmpty() ? -1 : st2.peek();
            st2.push(i);
        }

        int maxarea = 0;
        for(int i = 0 ; i <arr.length ; i++){
            int width = rb[i] - lb[i] - 1;
            int area = width * arr[i] ;
            
            if(area > maxarea){
                maxarea = area;
            }
        }

        System.out.println(maxarea);
    }
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,4,6};
        check(arr);
    }
}
