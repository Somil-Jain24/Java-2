class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
    }
}

class stack{
    Node head = null;
    Node tail = null;
    int size = 0;
    void push(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
            size++;
        }else{
            tail.next = temp;
            tail = tail.next;
            size++;
        }
    }
    int pop(){
        Node t1 = head;
        if(head == null){
            size = 0;
            return 0;
        }
        if(head.next == null){
            head = null;
            size = 0;
            return t1.data;
        }
        while(t1.next.next != null){
            t1 = t1.next;
        }
        int val = t1.next.data;
        t1.next =null;
        size--;
        return (val);
    }

    void print(){
        Node t = head;
        while(t!=null){
            System.out.print(t.data + " ");
            t=t.next;
        }
        System.out.println();

    }
    void length(){
        System.out.println(size);
    }


}

public class stack_by_linkedlist {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.print();
        System.out.println( st.pop());
        System.out.println( st.pop());
        System.out.println( st.pop());
        System.out.println( st.pop());
        System.out.println( st.pop());
        System.out.println( st.pop());
        // st.print();
        st.length();
    }
}
