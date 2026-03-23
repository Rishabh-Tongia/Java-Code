import java.util.*;
interface Shape {
    void computeArea();
}
class Cylinder implements Shape {
    double radius, height;
    double area;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public void computeArea() {
        area = 2 * Math.PI * radius * (radius + height);  // Surface area formula
        System.out.printf("Cylinder Surface Area: %f\n", area);
    }
}
class Cone implements Shape {
    double radius, height;
    double area;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public void computeArea() {
        double slantHeight = Math.sqrt(height * height + radius * radius); 
        area = Math.PI * radius * (radius + slantHeight);  
        System.out.printf("Cone Surface Area: %f\n", area);
    }
}

public class ImplementingInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height for Cylinder:");
        double cylRadius = sc.nextDouble();
        double cylHeight = sc.nextDouble();
        System.out.println("Enter radius and height for Cone:");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Shape shape;
        shape = new Cylinder(cylRadius, cylHeight);  
        shape.computeArea();                         
        shape = new Cone(coneRadius, coneHeight);    
        shape.computeArea();                         
    }
}

