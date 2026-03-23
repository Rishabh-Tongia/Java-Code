import java.util.*;

class MyQueue{
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    public void push(int x){
        stackIn.push(x);
    }

    public int pop(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }

    public int peek(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }

    public boolean empty(){
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
public class ImplementingQueueUsingStack {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
}
