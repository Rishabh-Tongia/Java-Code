import java.util.*;
public class WebsitetypeSwitchcase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String url,type;
        System.out.println("enter website url");
        url=sc.nextLine();
        type=url.substring(url.lastIndexOf(".")+1);
        System.out.println(type);
        switch(type)
        {
            case "com":System.out.println("Commercial");
            break;
            case "gov":System.out.println("government");
            break;
            case "org":System.out.println("organisation");
            break;
            case "net":System.out.println("network");
            break;
        }        
    }
}