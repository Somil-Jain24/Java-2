class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

}

public class max_and_min_value {
    private static int max(Node root) {

        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(max(root.left), max(root.right)));

    }

      private static int min(Node root) {

        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.val, Math.min(min(root.left), min(root.right)));

    }


  
    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = g;
        c.right = f;
        e.right = h;

        System.out.println(max(a));
        System.out.println(min(a));

    }

}