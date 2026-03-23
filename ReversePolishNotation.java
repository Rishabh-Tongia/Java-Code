import java.util.*;
public class ReversePolishNotation {
    public static int evalIRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if("+-*/".contains(token)){
                int b = stack.pop();
                int a = stack.pop();

                switch(token){
                    case "+":stack.push(a+b);break;
                    case "-":stack.push(a-b);break;
                    case "*":stack.push(a*b);break;
                    case "/":stack.push(a/b);break;
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String args[]){
        String[] inp={"2","1","+","3","*"};
        System.out.println(evalIRPN(inp));
    }
}
