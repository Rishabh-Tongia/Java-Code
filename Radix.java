import java.util.*;
public class Radix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String i;
        System.out.println("enter any type of no to find its radix");
        i=sc.nextLine();
        if(i.matches("[01]*"))
        {
            System.out.println("the entered no is of radix 2 aka binary");
        }
        else if(i.matches("[0-7]*"))
        {
            System.out.println("the entered no is of radix 8 aka octale");
        }
        else if(i.matches("[0-9A-F]*"))
        {
            System.out.println("Entered no is of radix 16 aka Hexadecimal");
        }
        else if(i.matches("[0-9]*"))
        
        {
            System.out.println("the radix of no is 10 aka decimal");
        }
    }   
}
