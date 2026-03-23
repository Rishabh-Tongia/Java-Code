import java.util.*;
public class SearchingElementInArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter "+n+" Values:");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("enter element for searchig");
        int key=sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println( "Element found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
