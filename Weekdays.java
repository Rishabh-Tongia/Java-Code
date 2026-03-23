import java.lang.*;
import java.util.*;
public class Weekdays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Day No.");
        int day=sc.nextInt();

        if(day==1){
            System.out.println("Mon");
        }
        else if(day==2){
            System.out.println("Tue");
        }
        else if(day==3){
            System.out.println("wed");
        }
        else if(day==4){
            System.out.println("thur");
        }
        else if(day==5){
            System.out.println("fri");
        }
        else if(day==6){
            System.out.println("sat");
        }
        else if(day==7){
            System.out.println("sun");
        }
        else{
            System.out.println("invalid number");
        }
    }
}