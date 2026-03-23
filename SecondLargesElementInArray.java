import java.util.*;
public class SecondLargesElementInArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]= new int[5];
        int i, max1=A[0],max2=A[0];
        System.out.println("enter 5 array numbers");
        for(i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        for(i=0;i<A.length;i++){
            if(max1<A[i]){
                max2=max1;
                max1=A[i];
            } 
            else if(max2<A[i]){
                max2=A[i];
            }
            }
            System.out.println(max2+" is second largest");
    }
}
