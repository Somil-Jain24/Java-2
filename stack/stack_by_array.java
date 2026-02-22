class stack{
    int idx = 0;
    int[] arr = new int[5];

    void push(int val){
        if(idx == arr.length){
            System.out.println("Stack Overflow");
            return;
        }
        arr[idx] = val;
        idx++;
    }

    int pop(){
        if(idx == 0) return -1;
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }

    int size(){
        return idx;
    }

    boolean isEmpty(){
        return idx == 0;
    }

    void print(){
        for(int i = 0; i < idx; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}


public class stack_by_array {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.print();
        System.out.println(st.pop());
        st.print();
        System.out.println(st.isEmpty());
    }
}
