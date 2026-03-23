import java.util.*;
import java.util.Queue;
class myStack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int data){
        if(q1.isEmpty()){
            q1.add(data);
        }
        else{
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }
    }

    public int pop(){
        if(!q1.isEmpty()){
            return q1.poll();
        }
        return -1;
    }
}

public class StackUsingQueue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        myStack ms = new myStack();
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println("Enter no of queries");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("press 1 for push && press 2 for pop");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter value to be pushed");
                int data = sc.nextInt();
                ms.push(data);
            }
            else if(choice == 2){
                ans.add(ms.pop());
            }
        }
        System.out.print("Final Ans ");
        for(int x : ans){
            System.out.print(x);
        }
    }
}
