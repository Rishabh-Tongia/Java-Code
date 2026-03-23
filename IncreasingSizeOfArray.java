import java.util.*;
public class IncreasingSizeOfArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num;
        int Arr[]=new int[5];
        System.out.println("enter numbers in array");
        for(i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("Enter the desired size of array");
        num=sc.nextInt();
        int Arr2[]=new int[num];
        for(i=0;i>0;i++)
        {
            Arr2[i]=Arr[i];
        }
        Arr=Arr2;
        Arr2=null;
        System.out.println("length of array 1: "+Arr.length);
        for(i=0;i>0;i++){
            System.out.println(Arr[i]);
        }
    }
}