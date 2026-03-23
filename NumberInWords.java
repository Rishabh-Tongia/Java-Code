import java.lang.*;
import java.util.*;
public class NumberInWords{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String rev="";
        while(num>0){
            int r=num%10;
            rev=rev+r;
            num=num/10;
        }
        char c;
        for(int i=rev.length()-1;i>=0;i--){
            c=rev.charAt(i);
            switch(c){
                case '0':System.out.print("Zero ");
                break;
                case '1':System.out.print("One ");
                break;
                case '2':System.out.print("Two ");
                break;
                case '3':System.out.print("Three ");
                break;
                case '4':System.out.print("Four ");
                break;
                case '5':System.out.print("Five ");
                break;
                case '6':System.out.print("Six ");
                break;
                case '7':System.out.print("Seven ");
                break;
                case '8':System.out.print("Eight ");
                break;
                case '9':System.out.print("Nine ");
                break;
                default: System.out.println("Wrong Input");
            }

        }


    }
}
