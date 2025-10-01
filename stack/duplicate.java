import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter String : - ");
        String st = s.nextLine();
        Stack<Character> str = new Stack<>();

        for(int i = 0; i<st.length();i++){
            char ch = st.charAt(i);
            if(ch == ')'){
                if(str.peek()== '('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(str.peek()!='('){
                        str.pop();
                    }
                    str.pop();
                }
            }else
            str.push(ch);
        }
        System.out.println(false);
    }
}
