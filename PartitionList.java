import java.util.*;

class listNode{
    int val;
    listNode next;

    listNode(int val){
        this.val=val;
    }
}
public class PartitionList {
    public listNode partition(listNode head,int x){
        listNode beforeHead= new listNode(0);
        listNode afterHead= new listNode(0);

        listNode before = beforeHead;
        listNode after = afterHead;

        while(head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            }
            else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next = null;
        before.next=afterHead.next;
        return beforeHead.next;
    }

    public static void printList(listNode head){
        while(head != null){
            System.out.print(head.val);
            if(head.next != null) System.out.print("->");
            head = head.next;
        }
    }
    public static void main(String args[]){
        listNode head = new listNode(1);
        head.next=new listNode(4);
        head.next.next=new listNode(4);
        head.next.next.next=new listNode(3);
        head.next.next.next.next=new listNode(2);
        head.next.next.next.next.next=new listNode(5);
        head.next.next.next.next.next.next=new listNode(2);

        PartitionList solution = new PartitionList();
        listNode result = solution.partition(head,3);
        System.out.println("partitioned list (x=3):");
        printList(result);
    }
}
