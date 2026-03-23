import java.util.*;
public class SherlockAndDivisors {

    public static int noOfDivisors(int num){
        int cnt=0;
        if(num%2!=0){
            return 0;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                
                if(i%2==0){
                    cnt++;
                }

                int other = num/i;
                if(other != i && other%2==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Testcases");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println(noOfDivisors(arr[i]));
        }
    }
}
