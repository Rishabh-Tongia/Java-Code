import java.util.*;
class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
}

public class PalindromeLinkedList {
    
    static node insert(node head,int data){
        node newNode = new node(data);

        if(head==null) return newNode;

        node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    static node reverse(node head){
        node prev = null;
        node curr = head;
        node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return head;
    }

    static boolean isPalindrome(node head){
        if(head == null || head.next==null) return true;

        node slow=head; 
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        node secondHalf = reverse(slow);
        node firstHalf = head;

        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }

    static void printList(node head){
        node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        node head = null;
        System.out.println("Enter no of nodes to enter");
        int n = sc.nextInt();
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insert(head, val);
        }
        System.out.print("Linked List: ");
        printList(head);

        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome? " + result);

    }
}
