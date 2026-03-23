import java.util.*;
class Cylinder{
    private double radius;
    private double height;

    public double getRadius()
    {
        return radius;
    }
    public double getHeigth()
    {
        return height;
    }
    public void SetRadius(int r)
    {
        if(r>0)                         //to control negative numbers
        radius=r;
        else 
        radius=0;
    }
    public void SetHeight(int h)
    {
        if(h>0)
        height=h;
        else
        height=0;
    }
    public void SetDimensions(int r, int h)
    {
        radius=r;
        height=h;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public double Area()
    {
        return Math.PI*radius*radius;
    }
    public double Perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double Volume()
    {
        return Math.PI*(radius*radius)*height;
    }

}
public class CylenderClass {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Cylinder c=new Cylinder(1,2);
        c.SetRadius(20);
        c.SetHeight(10);
        c.SetDimensions(10, 20);
        System.out.println(c.getRadius());
        System.out.println(c.getHeigth());
        System.out.println(c.Area());
        System.out.println(c.Perimeter());
        System.out.println(c.Volume());

    }
}