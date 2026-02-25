import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        
        
        System.out.println(q);
        
        
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        System.out.println(q);

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);

    }

}
