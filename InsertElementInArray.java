import java.util.*;
public class InsertElementInArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num,index,n;
        int A[]=new int[10];
        System.out.println("enter number of values to be inserted in array");
        n=sc.nextInt();
        System.out.println("enter values in array");
        for(i=0;i<n;i++){
        A[i]=sc.nextInt();
        }
        System.out.println("enter value to be inserted");
        num=sc.nextInt();
        System.out.println("enter index no at which value is to be inserted");
        index=sc.nextInt();
        for(i=A.length-1;i>index;i--)
        {
            A[i]=A[i-1];
        }
        A[index]=num;
        System.out.println("the updated list is");
        for(i=0;i<A.length;i++){
            System.out.println(A[i]);
        }

    }
}
