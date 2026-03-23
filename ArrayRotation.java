import java.util.*;
public class ArrayRotation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int i,tempL,tempR;
        String choice;
        System.out.println("enter numbers in array");
        for(i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        tempL=A[0];
        tempR=A[A.length-1];
        System.out.println("Enter your choice \n Enter L for left rotation \n Enter R for right rotatiion");
        choice=sc.nextLine();
        if("L".equals(choice)){
            for(i=1;i<A.length;i++){
                A[i-1]=A[i];
            }
            A[A.length-1]=tempL;
        }    
        else if("R".equals(choice)){
            for(i=A.length-1;i>0;i--){
                A[i]=A[i-1];
            }
            A[0]=tempR;
        }
        else{
            System.out.println("Enter valid input");
        }
        
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        } 
    }
} 


