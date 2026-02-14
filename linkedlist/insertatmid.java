public class insertatmid {
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }
    public static class linklist{
        Node head = null ;
        Node tail = null ;
        void insertmid(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i = 1 ; i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linklist ll = new linklist();
         Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(6);
        Node d = new Node(75);
        a.next = b;
        b.next = c;
        c.next = d;
        ll.head = a;

        ll.insertmid(3, 50);
        ll.display();
    }
}
