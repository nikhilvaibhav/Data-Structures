import java.util.Scanner;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree{
    public static void main(String[] args){
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);

        System.out.println("Enter the left of " + data);
        root.left = createTree();

        System.out.println("Enter the right of " + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}