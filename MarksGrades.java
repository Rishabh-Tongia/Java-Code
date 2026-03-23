import java.util.*;
public class MarksGrades {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter marks of three subjects");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int total=a+b+c;
        float avg=total/3;
        if(avg>=70)
        {
            System.out.println("A grade");
        }
        else if(avg<=70&&avg>=60)
        {
            System.out.println("B grade");
        }
        else if (avg<=60&&avg>=50)
        {
            System.out.println("C grade");
        }
        else if(avg<=50&&avg>=40)
        {
            System.out.println("D grade");
        }
        else if(avg<40)
        {
            System.out.println("E grade");
        }
        else
        {
            System.out.println("enter correct marks");
        }




    }
}
