import java.util.*;
public class DeletingElementInArray {
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
        System.out.println("enter value to be deleted");
        num=sc.nextInt();
        index=-1;
        for(i=0;i<n;i++){
        if(A[i]==num){
            index=i;
            break;
        }
        }
        if(index!=-1){
            for(i=index;i<A.length-1;i++)
        {
            A[i]=A[i+1];
        }
        System.out.println("the updated list is");
        for(i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    else{
        System.out.println("no such element");
    }
    }
}
