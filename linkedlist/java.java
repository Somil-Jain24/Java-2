public class java{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        //Normal print
    static void print(Node a){
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

        //Recursive
    static void display(Node head){
        if(head == null) return ;
        System.out.print(head.data+ " ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(6);
        Node d = new Node(75);
        a.next = b;
        b.next = c;
        c.next = d;
        print(a);
        System.out.println();
        display(a);
        
    }
}