import java.lang.*;
import java.util.*;
public class ArmstrongNo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        System.out.println(sum);
        if(sum==copy){
            System.out.println("Number is armstrong no");
        }
        else{
            System.out.println("Number is Not Armstrong");
        }
    }
}