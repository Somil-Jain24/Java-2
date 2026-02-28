import java.util.*;

public class reverse_K_element {
    public static void reverse(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int n = q.size() - k;
        while (i < k) {
            int element = q.poll();
            st.push(element);
            i++;
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        i = 0;
        while (i < n) {
            int element = q.poll();
            q.add(element);
            i++;
        }

        System.out.println(q);

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        reverse(q, 3);
    }
}