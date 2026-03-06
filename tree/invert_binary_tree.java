class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class invert_binary_tree {

     public static Node invert(Node root){
        if(root == null) return null;

        // swap children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursive call
        invert(root.left);
        invert(root.right);

        return root;
    }

      private static void print(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.right = h;
        

       print(a);
       System.out.println();
       invert(a);
       print(a);

    }





}
