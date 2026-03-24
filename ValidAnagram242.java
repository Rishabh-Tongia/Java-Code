import java.util.*;
public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] s_sorted = s.toCharArray();
        char[] t_sorted = t.toCharArray();

        Arrays.sort(s_sorted);
        Arrays.sort(t_sorted);

        return Arrays.equals(s_sorted,t_sorted);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s,t));
    }

}
