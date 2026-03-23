import java.util.*;

// Stack implemented using two queues
class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }

    // Push element onto stack
    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();
        }
    }

    // Remove and return the top element
    public int pop() {
        if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty");
        int a = q1.peek();
        q1.remove();
        return a;
    }

    // Return the top element without removing
    public int top() {
        if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return q1.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1: push");
            System.out.println("2: pop");
            System.out.println("3: top");
            System.out.println("4: empty");
            System.out.println("5: exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println(val + " pushed to stack.");
                    break;
                case 2:
                    if (!stack.empty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (!stack.empty()) {
                        System.out.println("Top element: " + stack.top());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.empty());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}