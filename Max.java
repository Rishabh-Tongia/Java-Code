import java.util.*;
public class Max {
    static int Maxx(int A[]){
        int i,max=0;
        for(i=0;i<A.length;i++){
            if(max<A[i])
            {
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int Arr[]=new int[5];
        System.out.println("enter elements in array");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sc.nextInt();
        }
        System.out.println("greatest number is "+ Maxx(Arr));
    }
}
