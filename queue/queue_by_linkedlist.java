
class Node{
    int data ;
    Node next ;
    Node(int data){
        this.data = data;
    }
}


class queue{
    int size = 0;
    Node head = null;
    Node tail = null;

    void add(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
    }

    int remove(){
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    int peek(){
        return head.data;
    }
    
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class queue_by_linkedlist {

    public static void main(String[] args) {
        queue q = new queue();
        q.add(10);
        q.add(40);
        q.add(50);
        q.add(60); 
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
    }


}
