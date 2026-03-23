import java.util.Scanner;

public class HexadecimalCheck {
    public static void main(String args[])
    {
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check");
        n=sc.nextLine();
        System.out.println(n.matches("[0-9A=F]*"));
    }
}
