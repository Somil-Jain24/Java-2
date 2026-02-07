public class insertatbeg {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linklist {
        Node head = null;
        Node tail = null;

        void insertbeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.insertbeg(5);
        ll.insertbeg(15);
        ll.insertbeg(55);
        ll.display();
    }

}