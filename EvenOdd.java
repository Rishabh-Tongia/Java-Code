import java.util.*;
public class EvenOdd {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int i;
    System.out.println("enter a number");
    i=sc.nextInt();
    if(i%2==0)
    {
        System.out.println("the numer is even");
    }
    else
    {
        System.out.println("the number is odd");
    }
    }
}
