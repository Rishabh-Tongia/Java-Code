import java.util.*;
import java.lang.*;
public class RemoveSpecialCharacter {
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        str=sc.nextLine();
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
}
