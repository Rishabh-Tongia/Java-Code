import java.util.*;
import java.lang.*;
public class GmailString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pos1,pos2;
        String email,username,domain,dcheck;
        boolean comp;
        System.out.println("enter email address");
        email=sc.nextLine();
        pos1= email.indexOf("@");
        pos2=email.indexOf(".");
        dcheck=email.substring(pos1+1,pos2);
        comp=dcheck.equals("gmail");
        System.out.println(comp);
        username= email.substring(0,pos1);
        System.out.println("username :- "+ username);
        domain=email.substring(pos1);
        System.out.println("domaion name :- "+ domain);
    }
}