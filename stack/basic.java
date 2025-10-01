import java.util.*;
public class basic{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(41);
        st.push(74);
        st.push(7);
        st.push(45);
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st.peek());

    }
}