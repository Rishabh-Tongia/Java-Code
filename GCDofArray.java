import java.util.*;
public class GCDofArray {
    
    static int FindGCD(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return FindGCD(b,a%b);
        }
    }

    static int FindGCDofArray(int[] arr){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=FindGCD(result,arr[i]);

            if(result==1){
                return 1;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] arr={12,24,36};
        int gcd=FindGCDofArray(arr);
        System.out.println("GCD of Array "+gcd);
    }
}
