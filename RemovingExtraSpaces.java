import java.util.Scanner;

public class RemovingExtraSpaces {
        public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        str=sc.nextLine();
        System.out.println(str.replaceAll("\\s+"," "));
    }
}
