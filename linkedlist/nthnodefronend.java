public class nthnodefronend {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // in only one traversal
    public static Node nthNode(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // deleting nth node from end
    public static Node nthdeleteNode(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }else{
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            // slow.data = slow.next.data;
            slow.next = slow.next.next;
            return head;
        }
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(4);
        Node f = new Node(8);
        Node g = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        display(a);
        System.out.println();
        Node k = nthNode(a, 7);
        System.out.println(k.data);
        Node m = nthdeleteNode(a, 7);
        display(m);
    }
}
