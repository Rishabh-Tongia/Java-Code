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

    // //Using HashMap 
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()){
    //         return false;
    //     }

    //     Map<Character,Integer> mapS = new HashMap<>();
    //     Map<Character,Integer> mapT = new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
    //         mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
    //     }

    //     if(mapS.equals(mapT)) return true;

    //     return false;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s,t));
    }

}
