import java.util.*;
public class CountingDigitsInNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int r=num%10;
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
