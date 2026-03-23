import java.util.*;

public class strobogrammaticNumber {

    public static boolean isStrobogrammatic(String num){
        HashMap<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');

        int left=0;
        int right=num.length()-1;

        while(left<=right){
            char l=num.charAt(left);
            char r=num.charAt(right);

            if(!map.containsKey(l) || map.get(l) != r){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        String num = sc.nextLine();
        System.out.println(isStrobogrammatic(num));
    }
}
