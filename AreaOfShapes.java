import java.util.*;
public class AreaOfShapes {
    static double Area(double l,double b)
    {
        return l*b;
    }
    static double Area(double r)
    {
        return 3.14*r*r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double Length,Bredth,radius,Result;
        String choice;
        System.out.println("enter Rectangle for area of rectangle\n enter Circle for area of circle");
        choice=sc.nextLine();

        if("Rectangle".equals(choice))
        {
            System.out.println("enter length and bredth for rectanght area");
            Length=sc.nextDouble();
            Bredth=sc.nextDouble();
            Result=Area(Length,Bredth);
            System.out.println("area of Rectangle is "+Result);
        }
        else if("Circle".equals(choice))
        {
            System.out.println("enter radius of circle");
            radius=sc.nextDouble();
            Result=Area(radius);
            System.out.println("Area of circle is "+Result);
        }
        else
        {
            System.out.println("enter valid choice");
        }
    }
}
