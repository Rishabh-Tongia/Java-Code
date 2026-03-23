import java.util.Scanner;
 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
 }
 public class OddEvenList {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }
    static Node oddEvenList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }
        System.out.print("Original List: ");
        printList(head);

        head = oddEvenList(head);
        System.out.print("Odd-Even Reordered List: ");
        printList(head);
    }
 }