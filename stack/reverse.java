import java.util.Stack;

public class reverse {
    public static void reverse(Stack<Integer> st){
        if(st.size() == 0) return;
        int ele = st.pop();
        System.out.print(ele+" ");
        reverse(st);
        st.push(ele);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20); 
        st.push(30); 
        st.push(40); 
        st.push(50); 
        st.push(60); 
        st.push(70);
        System.out.println(st);
        reverse(st);
    }
}