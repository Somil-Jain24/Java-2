import java.util.*;

public class pre_post_expression {

    public static int precedence(char oprator) {
        if (oprator == '+' || oprator == '-') {
            return 1;
        } else if (oprator == '*' || oprator == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    public static int operation(int v1, int v2, char oprator) {
        if (oprator == '+') {
            return v1 + v2;
        } else if (oprator == '-') {
            return v1 - v2;
        } else if (oprator == '*') {
            return v1 * v2;
        } else if (oprator == '/') {
            return v1 / v2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Expression : ");
        String exp = sc.nextLine();

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> opn = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                opn.push(ch);
            } else if ((ch >= '0' && ch <= '9') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                pre.push(ch + "");
                post.push(ch + "");
            } else if (ch == ')') {
                while (opn.peek() != '(') {
                    char op = opn.pop();

                    String post2 = post.pop();
                    String post1 = post.pop();
                    String postf = post1 + post2 + op;
                    post.push(postf);

                    String pre2 = pre.pop();
                    String pre1 = pre.pop();
                    String pref = op + pre1 + pre2;
                    pre.push(pref);

                }
                opn.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!opn.isEmpty() && opn.peek() != '(' && precedence(ch) <= precedence(opn.peek())) {
                    char op = opn.pop();
                    String post2 = post.pop();
                    String post1 = post.pop();
                    String postf = post1 + post2 + op;
                    post.push(postf);

                    String pre2 = pre.pop();
                    String pre1 = pre.pop();
                    String pref = op + pre1 + pre2;
                    pre.push(pref);
                }

                opn.push(ch);
            }

        }

        while (!opn.isEmpty()) {
            char op = opn.pop();
            String post2 = post.pop();
            String post1 = post.pop();
            String postf = post1 + post2 + op;
            post.push(postf);

            String pre2 = pre.pop();
            String pre1 = pre.pop();
            String pref = op + pre1 + pre2;
            pre.push(pref);
        }

        System.out.println("Prefix is : " + pre.peek());
        System.out.println("Postfix is : " + post.peek());

    }
}