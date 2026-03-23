
import java.util.*;
public class HCFofNumber {
    static int HCF (int n,int m)
    {
        int i;
            for(i=2;i<n;i++)
            {
                if(n%i==0&&m%i==0)
                {
                    return i;
                }
            }
                return 0;
    }                   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int result;
        System.out.println("enter first number");
        num1=sc.nextInt();
        System.out.println("enter first number");
        num2=sc.nextInt();
        result=HCF(num1,num2);
        System.out.println(result);
    }
}

