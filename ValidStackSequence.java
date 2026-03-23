import java.util.*;
public class ValidStackSequence {
    public static boolean validStackSequences(int[]pushed,int[]popped){
        Stack<Integer> stack=new Stack<>();
        int j = 0;
        for(int x : pushed){
            stack.push(x);
            while(!stack.isEmpty()&&j<popped.length&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return j == popped.length;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pushed=new int[n];
        int[] popped= new int[n];
        for(int i=0;i<n;i++){
            pushed[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            popped[i]=sc.nextInt();
        }
        System.out.println(validStackSequences(pushed,popped));
    }
}
