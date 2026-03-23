import java.util.*;
public class DiscountUsingVarargs {
    static int Discount(int...A)
     {
        int sum=0,disc=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        if(sum<500)
        {
            disc=sum;
        }
        if(sum>=500)
        {
            disc=sum-((sum/100)*10);
        }
        if(sum>500&&sum<=1000)
        {
            disc=sum-((sum/100)*15);
        }
        if(sum>1000)
        {
            disc=sum-((sum/100)*20);
        }
        return disc;
     }
     public static void main(String args[])
     {
        System.out.println(Discount());
        System.out.println(Discount(100));
        System.out.println(Discount(200,300));
        System.out.println(Discount(100,200,300,400));
     }
}
