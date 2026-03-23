import java.util.*;
public class Age {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter age");
        i=sc.nextInt();
        if(i>=18)
        {
            System.out.println("the person is elder");
        }
        else
        {
            System.out.println("the child is younger");
        }
    }
    
}
