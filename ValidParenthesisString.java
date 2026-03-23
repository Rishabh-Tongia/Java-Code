import java.util.*;
public class ValidParenthesisString {
    public static boolean checkValidString(String s){
        int low=0,high=0;
        for(char c:s.toCharArray()){
            if(c == '('){
                low++;high++;
            }
            else if(c == ')'){
                low--;high--;
            }
            else{
                low--;high++;
            }
            if(high<0) return false;
            if(low<0) low=0;
        }
        return low==0;

    }
        public static void main(String args[]){
            String s1="(*)";
            System.out.println(checkValidString(s1));
        }
}
