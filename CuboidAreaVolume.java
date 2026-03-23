import java.util.*;
public class CuboidAreaVolume {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int length,bredth,height;
        int area,volume;
        System.out.println("enter Length,Bredth,Height");
        length=sc.nextInt();
        bredth=sc.nextInt();
        height=sc.nextInt();
        area=2*(length*bredth+length*height+bredth*height);
        volume=length*bredth*height;
        System.out.println("Total Area is "+ area);
        System.out.println("TZotal volume is "+volume);

    }
}
