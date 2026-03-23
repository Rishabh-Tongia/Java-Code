import java.util.*;

class PasswordValidator{

    public static boolean isValid(String password){
        if(password.length()<8){
            return false;
        }
        int digit=0;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch >='0' && ch<='9'){
                digit++;
            }
            else if(Character.toLowerCase(ch)>='a'&& Character.toLowerCase(ch)<='z'){
                continue;
            }
            else{
                return false;
            }
        }
        return digit >=2;
    }
    
}

public class PasswordChecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PasswordValidator pv=new PasswordValidator();
        System.out.println("enter password");
        String password=sc.nextLine();
        if(pv.isValid(password)){
            System.out.println("Valid Password !");
        }
        else{
            System.out.println("Invalid Password !");
        }
    }    
}
