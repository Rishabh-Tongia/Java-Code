import java.util.*;

class geometry {
    int cox,coy;
    String color;

    public geometry(int cox,int coy,String color){
        this.cox=cox;
        this.coy=coy;
        this.color=color;
    }

    public void print(){
        System.out.println("geometry Details : ");
        System.out.println("Color : "+color);
        System.out.println("co-ordinate x : "+cox);
        System.out.println("co-Ordinate y : "+coy);
    }
}


class circle extends geometry{
    int radius;
    double area;

    public circle(int radius,int cox,int coy,String color){
        super(cox, coy, color); 
        this.radius=radius;
    }

    public double CirAreaCal(){
        area=3.14*radius*radius;
        return area;
    }

    @Override
    public void print(){
        System.out.println("Circle Details : ");
        System.out.println("co-ordinate x : "+cox);
        System.out.println("co-Ordinate y : "+coy);
        System.out.println("Color : "+super.color);
        System.out.println("Radius : "+radius);
        System.out.println("Area : "+area);
    }
}

class rectangle extends geometry{
    int length,width;
    float area;

    public rectangle(int length,int width,int cox,int coy,String color){
        super(cox, coy, color); 
        this.length=length;
        this.width=width;
    }

    public float RecAreaCal(){
        area=length*width;
        return area;
    }

    @Override
    public void print(){
        System.out.println("Rectangle Details : ");
        System.out.println("co-ordinate x : "+cox);
        System.out.println("co-Ordinate y : "+coy);
        System.out.println("Color : "+super.color);
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Area : "+area);
    }
}


class Inheritance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        geometry gom = new geometry(5, 6, "red");
        circle crl = new circle(1, 2,5 , "blue");
        rectangle rct = new rectangle(3, 4, 6, 5, "green");
        gom.print();
        crl.CirAreaCal();
        crl.print();
        rct.RecAreaCal();
        rct.print();
    }
}