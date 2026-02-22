import java.util.Stack;

public class sliding_window {
    public static void window(int[] arr, int k) {
        int[] temp = new int[arr.length];
        temp[arr.length - 1] = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            temp[i] = st.isEmpty() ? arr.length : st.peek();

            st.push(i);
        }
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;
            while (temp[j] < i + k) {
                j = temp[j];
            }
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 9, 4 };
        window(arr, 4);
    }
}
