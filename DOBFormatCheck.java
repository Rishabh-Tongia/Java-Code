import java.lang.*;
import java.util.*;
public class DOBFormatCheck {
    public static void main(String args[])
    {
        String DOB;
        System.out.println("enter birth date");
        Scanner sc=new Scanner(System.in);
        DOB=sc.nextLine();
        System.out.println(DOB.matches("([0-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/[0-9]{4}"));
    }
}
