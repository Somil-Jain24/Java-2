class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

}

public class product {
    private static int Multiply_Ignore_Zero(Node root) {
        if (root == null)
            return 1;
        int left = Multiply_Ignore_Zero(root.left);
        int right = Multiply_Ignore_Zero(root.right);
        if (root.val == 0)
            return left * right;

        return root.val * left * right;
    }

    private static int Multiply_Without_Ignore_Zero(Node root) {
        if (root == null)
            return 1;
        return root.val * Multiply_Without_Ignore_Zero(root.left) * Multiply_Without_Ignore_Zero(root.right);

    }

    public static void main(String[] args) {

        Node a = new Node(0);
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

        System.out.println(Multiply_Ignore_Zero(a));
        System.out.println(Multiply_Without_Ignore_Zero(a));

    }

}