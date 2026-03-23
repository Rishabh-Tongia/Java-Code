import java.lang.*;
import java.util.*;
public class ReversingNo{

    public static boolean isprime(int num){
        if (num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number : ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("Reverse is : "+rev);

        if(isprime(rev)){
            System.out.println("Reverse is a prime number");
        }
        else{
            System.out.println("Reverse is a not prime number");
        }

    }
}