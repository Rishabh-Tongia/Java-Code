import java.util.*;
import java.lang.*;
public class Area {
    public static void main(String args[])
    {
        int a,b,c;
        float s;
        double Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of all sides of triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=2f/(a+b+c);
        Area=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("Area of given triangle is " + Area);
    }
}
