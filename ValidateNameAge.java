import java.util.*;
public class ValidateNameAge {
    static boolean Validate(int A)
    {
        return A>=3&&A<=17;
    }
    static boolean Validate(String N)
    {
        return N.matches("[A-Za-z\\s]*");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        boolean ResultN,ResultA;
        String name;
        System.out.println("Enter your name");
        name=sc.nextLine();
        ResultN=Validate(name);
        if(ResultN==true)
        System.out.println("yes you entered correct name");
        else
        System.out.println("No enter proper name");
        System.out.println("Enter your age");
        age=sc.nextInt();
        ResultA=Validate(age);
        if(ResultA==true)
        System.out.println("yes you entered correct age");
        else
        System.out.println("No your age is not proper for school admission");
    }
}
