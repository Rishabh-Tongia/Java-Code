import java.util.Scanner;

public class FibonicciSeries {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int trm0=sc.nextInt();
        int trm1=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(trm0+" "+trm1+" ");
        int fibo=trm1;
        for(int i=0;i<n;i++){
            fibo=fibo+trm0;
            System.out.print(fibo+" ");
            trm0=trm1;
            trm1=fibo;
        }
    }
}
