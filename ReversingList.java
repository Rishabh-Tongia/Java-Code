import java.util.*;

class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
    }
}

public class ReversingList {

    static void printList(node head){
        node temp=head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static node reverse(node head){
        node prev=null;
        node current=head;
        node next=null;

        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node head=null;
        node tail=null;

        System.out.print("Enter no of elements in list :");
        int n=sc.nextInt();
        System.out.println("Enter"+" elements ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            node newNode=new node(data);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        System.out.println("Original Linked List :");
        printList(head);

        head=reverse(head);

        System.out.println("Reversed linked list :");
        printList(head);
    }
}

