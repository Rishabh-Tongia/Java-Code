import java.lang.*;
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("=====CALCULATOR=====");
        System.out.println("ADD \n SUB \n MUL \n DIV");
        System.out.println("Enter any 2 Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        String option=sc.nextLine();
        option=option.toUpperCase();
        switch(option){
            case "ADD": System.out.println("addition is:"+(x+y));
            break;
            case "SUB": System.out.println("subtraction is:"+(x-y));
            break;
            case "MUL": System.out.println("multiplication is:"+(x*y));
            break;
            case "DIV": System.out.println("division is:"+(x/y));
            break;
            default: System.out.println("Wrong input given");
        }
    }
}
