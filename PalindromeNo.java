import java.lang.*;
import java.util.*;
public class PalindromeNo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number : ");
      int num=sc.nextInt();
      int cpy=num;
      int rev=0;
      while(num>0){
        int r=num%10;
        rev=rev*10+r;
        num=num/10;
      }  
      if(rev==cpy){
        System.out.println("Palindrome No");
      }
      else{
        System.out.println("NOT Palindrome no");
      }
    }
}