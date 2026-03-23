import java.util.*;
class Rectangle{
    public double length,bredth;
    public double Area(){
        return length*bredth;
    }
    public double Perimeter(){
        return 2*(length+bredth);
    }
    public boolean IsSquare(){
        if(length==bredth)
        return true;
        else
        return false;
    }
}
public class RectangleClass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Rectangle rect=new Rectangle();
        rect.length=5;
        rect.bredth=4;
        System.out.println(rect.IsSquare());
        System.out.println(rect.Perimeter());
        System.out.println(rect.Area());  
    }
}
