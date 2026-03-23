import java.util.*;
class StringReversal
{
    String str;
    StringReversal(String str)
    {
        this.str=str;
    }
    String rev(String a)
    {
        String nt="";
        for(int i=(a.length())-1;i>=0;i--)
        {
            nt+=a.charAt(i);
        }
        return nt;
    }
    void operation()
    {
        String s[]=new String[str.length()];
        String nstr="";
        s=str.split(" ");
        for(int i=0;i<s.length;i++)
        {
            nstr+="a"+rev(s[i])+"a"+" ";
        }
        System.out.println(nstr);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        StringReversal s1= new StringReversal(str);
        s1.operation();
        sc.close();
    }
    
}
