import java.util.*;

public class balance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String : - ");
        String st = s.nextLine();
        Stack<Character> str = new Stack<>();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                str.push(ch);
            } else if (ch == ')') {
                boolean chk = check(str, '(');

                if (chk == false) {
                    System.out.println(chk);
                }

            } else if (ch == '}') {
                boolean chk = check(str, '{');
                if (chk == false) {
                    System.out.println(chk);
                }
            } else if (ch == ']') {
                boolean chk = check(str, '[');
                if (chk == false) {
                    System.out.println(chk);
                }
            }
        }
        if(str.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

    public static boolean check(Stack<Character> str, char c) {
        if (str.size() == 0) {
            return false;
        } else if (str.peek() != c) {
            return false;
        } else {
            str.pop();
            return true;
        }
    }
}
