import java.util.*;
public class MaxElementInArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,max=0;
        int A[]= new int[5];
        System.out.println("enter 5 array numbers");
        for(i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        for(i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            } 
            }
            System.out.println(max+" is greatest");
    }
  }

