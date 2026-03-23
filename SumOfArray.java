import java.util.*;
public class SumOfArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        int A[]= new int[5];
        System.out.println("enter 5 numbers in aray");
        for(i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("the sum of array is");
        for(i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println(sum);
    }
}
