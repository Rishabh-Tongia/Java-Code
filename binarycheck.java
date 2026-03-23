import java.util.*;
import java.lang.*;
public class binarycheck {
    public static void main(String arg[])
    {
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check");
        n=sc.nextLine();
        System.out.println(n.matches("[01]*"));

    }
}
