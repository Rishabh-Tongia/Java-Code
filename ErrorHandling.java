import java.util.*;
class InvalidCourseCodeException extends Exception 
{
    InvalidCourseCodeException(String m)
    {
        super(m);
    }
}
class ErrorHandling
{
    String ccode,cname;
    ErrorHandling(String a,String b)
    {
        ccode=a;
        cname=b;
    }
    void validate()throws InvalidCourseCodeException
    {
            if(Character.isUpperCase(ccode.charAt(0))==true && Character.isUpperCase(ccode.charAt(1))==true && Character.isUpperCase(ccode.charAt(2))==true && Character.isUpperCase(ccode.charAt(3))==true && Character.isDigit(ccode.charAt(4))==true && Character.isDigit(ccode.charAt(5))==true && Character.isDigit(ccode.charAt(6))==true && ccode.charAt(ccode.length()-1)=='P' || ccode.charAt(ccode.length()-1)=='L')
            {
                for(int i=0;i<cname.length();i++)
                {
                    if(cname.toUpperCase().charAt(i)>='A' || cname.toUpperCase().charAt(i)<='Z' ||cname.charAt(i)==' ')
                        continue;
                    else
                    throw new InvalidCourseCodeException("Course Code is not as per the standard");
                }
            }
            else
            throw new InvalidCourseCodeException("Course Code is not as per the standard");
            
    
    }
    void display()
    {
        System.out.println(cname);
        System.out.println(ccode);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course code : ");
        String ccode = sc.nextLine();
        System.out.println("Enter the course name : ");
        String cname = sc.nextLine();
        ErrorHandling ob = new ErrorHandling(ccode,cname);
        try {
            ob.validate();
        } catch (InvalidCourseCodeException e) {
            System.out.println(e.getMessage());
        }
        ob.display();
        sc.close();
    }

}
