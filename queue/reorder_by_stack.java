import java.util.*;

public class reorder_by_stack {

    static void reorder(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> finl = new Stack<>();
        for(int i = 0; i < n; i++){
            if(i < (n+1)/2){
            st.push(q.poll());
            }else 
            st1.push(q.poll());
        }
        
        if(st.size() > st1.size()){
            while(!st1.isEmpty()){
                finl.push(st.pop());
                finl.push(st1.pop());
            }
            finl.push(st.pop());
            
        }else{
            while(!st.isEmpty()){
                finl.push(st1.pop());
                finl.push(st.pop());
            }
        }
        
        while(!finl.isEmpty()){
            st.push(finl.pop());
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(00);
        q.add(20);
        q.add(40);
        q.add(30);
        q.add(10);
        q.add(50);
        q.add(60);
        
        reorder(q);
        
    }

}
