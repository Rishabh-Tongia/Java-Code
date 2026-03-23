import java.util.*;
public class CopyingArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num;
        int Arr[]=new int[10];
        int Arr2[]=new int[Arr.length-1];
        System.out.println("enter numbers in array");
        for(i=0;i<Arr.length-1;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("the copied array is");
        for(i=0;i<Arr.length-1;i++){
            Arr2[i]=Arr[i];
            System.out.println(Arr2[i]);
        }
    
    }
}
