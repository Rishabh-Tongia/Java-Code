import java.util.*;
public class MaximumOfNumbersUsingVarargs {
    static int Max(int...A)
    {
        if(A.length==0) return Integer.MIN_VALUE;

        int m=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(m<A[i])
            {
                m=A[i];
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Maximum number is");
        System.out.println(Max());
        System.out.println(Max(10));
        System.out.println(Max(10,20));
        System.out.println(Max(10,20,30));
        System.out.println(Max(10,20,30,40));
    }
}
 