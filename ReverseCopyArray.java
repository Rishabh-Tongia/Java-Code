import java.util.*;
public class ReverseCopyArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,num;
        int Arr[]=new int[5];
        int Arr2[]=new int[Arr.length];
        System.out.println("enter numbers in array");
        for(i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("the reverse copied array is");
        for(i=Arr.length-1;i>=0;i--){
            Arr2[(Arr.length-1)-i]=Arr[i];
        }
        for(i=0;i<Arr.length;i++){
            System.out.println(Arr2[i]);
        }

    }    
}
