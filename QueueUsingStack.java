import java.util.*;
class MyQueue {
    Stack<Integer> instack = new Stack<>();
    Stack<Integer> outstack = new Stack<>();

    public void push(int data){
        instack.push(data);
    }

    public int pop(){
        if(outstack.isEmpty()){
            while(!instack.isEmpty()){
                outstack.push(instack.pop());
            }
        }
        return outstack.pop();
    }

    public int peek(){
        if(outstack.isEmpty()){
            while(!instack.isEmpty()){
                outstack.push(instack.pop());
            }
        }
        return outstack.peek();
    }

    public boolean empty(){
        return instack.isEmpty() && outstack.isEmpty();
    }
}

public class QueueUsingStack{
    public static void main(String args[]){
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.peek());
    }
}
