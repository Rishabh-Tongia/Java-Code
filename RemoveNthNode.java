import java.util.Scanner;

class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveNthNode {

    public static void printList(node head){
        node temp=head;
        while(temp.next != null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static node insert(node head,int data){
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

    public static node removeNthNodeFromEnd(node head,int n){
        node dummy=new node(0);
        dummy.next=head;
        node fast =dummy;
        node slow=dummy;
        for(int i=0;i<=n;i++){
            if(fast !=null){
                fast=fast.next;
            }
            else{
                return head;
            }
        }

        while(fast != null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node head=null;
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        System.out.println("enter elements ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insert(head, data);
        }
        System.out.println("original list");
        printList(head);

        System.out.println("Enter node to be removed");
        int tar=sc.nextInt();
        removeNthNodeFromEnd(head,tar);

        System.out.println("Altered list");
        printList(head);
    }
}
