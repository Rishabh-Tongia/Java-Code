import java.util.*;
public class ReverseIntegerOrArray {
    static int Reverse(int a)
    {
        int fin=0,mod=0,i=0;
        while(a!=0){
            mod=a%10;
            fin=fin*10+mod;
            a=a/10;
        }
        return fin;
    }
    static int[] Reverse(int A[])
    {
        int i;
        int B[]=new int[A.length];
        for(i=A.length-1;i>=0;i--)
        {
            B[A.length-1-i]=A[i];
        }
        return B;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number,i;
        int Arr[]=new int[5];
        System.out.println("enter number");
        number=sc.nextInt();
        System.out.println("Reverse of number is "+Reverse(number));
        System.out.println("enter numbers in array");
        for(i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println(Reverse(Arr));
    }
}

