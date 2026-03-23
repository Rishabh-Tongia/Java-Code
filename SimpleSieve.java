import java.util.*;

public class SimpleSieve {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean nums[] = new boolean[n+1];

        for(int i=2;i<=n;i++){
            nums[i]=true;
        }

        for(int i=2;i*i<=n;i++){
            if(nums[i]==true){
                for(int j=(i*i);j<=n;j=j+i){
                    nums[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(nums[i]==true){
                System.out.println(i);
            }
        }
    }
}
