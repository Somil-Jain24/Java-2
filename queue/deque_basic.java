class Node{
    int data;
    Node next , prev ;
    Node(int data){
        this.data = data;
    }
}

class deque{
    Node front = null;
    Node rear = null;
    int size = 0;

    void insertfront(int val){
        Node temp = new Node(val);
        if(front == null){
            front = rear = temp;
        }else{
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
    }

    void insertrear(int val){
        Node temp = new Node(val);
        if(front == null){
            front = rear = temp;
        }else{
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
    }

    int deletefront(){
        Node temp = front;
        front = front.next;
        front.prev = null;

        return temp.data;
    }

    int deleterear(){
        Node temp = rear;
        rear = rear.prev;
        rear.next = null;

        return temp.data;

    }

    void display(){
        Node temp = front;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}

public class deque_basic {
    public static void main(String[] args) {
        deque q = new deque();

        q.insertfront(10);
        q.insertfront(20);
        q.insertfront(30);
        q.insertfront(40);
        q.insertrear(2);
        q.insertrear(3);
        q.insertrear(4);
        q.insertrear(5);
        q.display();
        q.deletefront();
        q.deleterear();
        q.display();

        

    }
}
