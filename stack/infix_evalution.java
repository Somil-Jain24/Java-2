import java.util.*;

public class infix_evalution {
    public static int precedence(char oprator){
        if(oprator == '+' || oprator == '-'){
            return 1;
        }else if(oprator == '*' || oprator == '/'){
            return 2;
        }else{
            return 0;
        }
    }
    public static int operation (int v1 , int v2 , char oprator){
        if(oprator == '+'){
            return v1 + v2;
        }else if(oprator == '-'){
            return v1-v2;
        }else if(oprator == '*'){
            return v1 * v2;
        }else if(oprator == '/'){
            return v1 / v2;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Expression : ");
        String exp = sc.nextLine();

        Stack <Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0 ;i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                operators.push(ch);
            }else if(Character.isDigit(ch)){
                operands.push(ch - '0');
            }else if(ch == ')'){
                while(operators.peek() != '('){
                    char oprator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int ans = operation(v1, v2, oprator);
                    operands.push(ans);

                }operators.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!operators.isEmpty() && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    char oprator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int ans = operation(v1, v2, oprator);
                    operands.push(ans);
                }
                operators.push(ch);
            }
                
        }

        while(!operators.isEmpty()){
                    char oprator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int ans = operation(v1, v2, oprator);
                    operands.push(ans);
        }
        System.out.println("After Evalution : " + operands.peek());

    }
}
