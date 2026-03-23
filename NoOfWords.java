import java.util.*;
public class NoOfWords {
    public static void main(String args[])
    {
        String str,str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        str=sc.nextLine();
        str1=str.replaceAll("\\s+"," ");
        String words[]=str1.split("\\s");
        System.out.println(words.length);

    }
}
