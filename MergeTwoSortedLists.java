import java.util.*;
class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MergeTwoSortedLists {

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

    public static void viewList(node head){
        node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static node merge(node l1,node l2){
        node dummy=new node(0);
        node current=dummy;

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1 != null){
            current.next=l1;
        }
        else{
            current.next=l2;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of elements for list 1");
        int n1=sc.nextInt();
        node head1=null;
        for(int i=0;i<n1;i++){
            int data=sc.nextInt();
            head1=insert(head1,data);
        }
        System.out.print("original list 1 :");
        viewList(head1);

        System.out.print("Enter No of elements for list 2 :");
        int n2=sc.nextInt();
        node head2=null;
        for(int i=0;i<n2;i++){
            int data=sc.nextInt();
            head2=insert(head2,data);
        }
        System.out.println("original list 2 :");
        viewList(head2);

        node mergedHead=merge(head1,head2);
        System.out.print("merged Sorted list :");
        viewList(mergedHead);
    }
}