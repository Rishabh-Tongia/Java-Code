import java.util.*;
public class GreaterOfThreeNo {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a +" is greates number");
        }
        else
        {
            if(b>c)
            {
                System.out.println(b +" is greatest");
            }
            else
            {
                System.out.println(c +" is greatest");
            }
        }
    }
}
