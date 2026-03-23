import java.util.*;

class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemovingElementLinkedList {

    static node insert(node head,int data){
        node newNode=new node(data);
        if(head==null){
            return newNode;
        }
        else{
            node temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        return head;
    }

    public static void printList(node head){
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static node RemoveElement(node head,int target){
        node dummy=new node(0);
        dummy.next=head;

        node current=dummy;
        while(current.next != null){
            if(current.next.data==target){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node head=null;
        // System.out.println("Enter no of elements");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insert(head,data);
        }
        System.out.println("Original List is :");
        printList(head);

        System.out.println("Enter element to remove");
        int target=sc.nextInt();
        head=RemoveElement(head,target);

        System.out.println("updated List");
        printList(head);
    }
}