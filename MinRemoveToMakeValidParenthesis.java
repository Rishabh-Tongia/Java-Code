import java.util.*;
public class MinRemoveToMakeValidParenthesis {

    public static String minRemoveToMakeValid(String s){
        StringBuilder result=new StringBuilder();
        int balance = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                balance++;
                result.append(ch);
            }
            else if(ch == ')'){
                if(balance==0) continue;
                balance--;
                result.append(ch);
            }
            else{
                result.append(ch);
            }
        }
        
        StringBuilder finalResult = new StringBuilder();
        for(int i=result.length()-1;i>=0;i--){
            char ch = result.charAt(i);
            if(ch =='(' && balance>0){
                balance--;
                continue;
            }
            finalResult.append(ch);
        }
        return finalResult.reverse().toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(minRemoveToMakeValid(inp));
    }
}
