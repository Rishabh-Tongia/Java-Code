import java.util.*;
public class PrimeNumber {
    static boolean prime (int n)
    {
            int p=0;
            for(int i=2;i<n;i++)
            {
            if(n%i==0&&n!=2)
                return false;
            }
                return true;
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        boolean result;
        System.out.println("enter a number to check its prime or not");
        num=sc.nextInt();
        result=prime(num);
        System.out.println(result);
    }
}
