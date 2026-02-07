public class insertatend {
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

        void insertend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
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
        ll.insertend(5);
        ll.insertend(54);
        ll.insertend(50);
        ll.display();
    }
}
