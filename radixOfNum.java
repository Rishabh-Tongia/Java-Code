import java.lang.*;
import java.util.*;
public class radixOfNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num;
        num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("octel radix");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Decimal radix");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal radix");
        }
        else{
            System.out.println("Not the number");
        }
    }
}