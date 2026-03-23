import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch=='['){
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                int top=stack.pop();
                if((ch ==')' && top!='(') || (ch =='}' && top!='{') || (ch ==']' && ch =='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        System.out.println(isValid(inp));
    }
}
