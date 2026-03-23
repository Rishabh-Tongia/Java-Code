import java.lang.*;
import java.util.*;
public class WebsiteType{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("Hyper text transfer protocol");
        }
        if(protocol.equals("ftp")){
            System.out.println("file transfer protocol");
        }


        String ext=url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com")){
            System.out.println("Coomercial");
        }
        else if(ext.equals("org")){
            System.out.println("Organizatiional");
        }

    }
}