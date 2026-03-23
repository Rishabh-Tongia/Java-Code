import java.util.*;

class node{
    int val;
    node left;
    node right;

    public node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class binaryTree {

    public static node insert(int val , node root){
        node newNode = new node(val);

        if(root == null){
            return newNode;
        }
        node temp = root;

        if(val <= root.left.val){
            root.left = insert(val,root.left);
        }
        else{
            root.right = insert();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    }
}
