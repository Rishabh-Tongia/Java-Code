import java.util.*;

class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedListImplementation{

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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node head=null;
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insert(head,data);
        }
        System.out.println("Original List is :");
        printList(head);

    }
}