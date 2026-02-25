import java.util.*;

public class print {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> t = new LinkedList<>();
        q.add(00);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        // // print with the help of inbuilt function
        // while (!q.isEmpty()) {
        // System.out.print(q.peek() + " ");
        // t.add(q.remove());
        // }
        // System.out.println();
        // System.out.print(t);
        // System.out.println();
        // System.out.println(q);

        // remove all even index
        int n = q.size();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                q.remove();
            }else
            t.add(q.remove());
        }

        System.out.println(t);

    }

}
// add, remove , peek, size