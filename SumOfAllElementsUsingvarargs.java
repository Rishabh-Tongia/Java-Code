import java.util.*;
public class SumOfAllElementsUsingvarargs {
     static int Sum(int...A)
     {
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        return sum;
     }
     public static void main(String args[])
     {
        System.out.println(Sum());
        System.out.println(Sum(10));
        System.out.println(Sum(10,20));
        System.out.println(Sum(10,20,30,40));
     }  
}
