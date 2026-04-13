import java.util.*;
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] hash = new int[26];

        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }

        for(int i : hash){
            if(i != 0){
                return false;
            }
        }

        return true;
    }

    // public boolean isAnagram(String s, String t) {
    //     char[] str1 = s.toCharArray();
    //     char[] str2 = t.toCharArray();

    //     Arrays.sort(str1);
    //     Arrays.sort(str2);

    //     return Arrays.equals(str1,str2);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s, t));
    }
}
