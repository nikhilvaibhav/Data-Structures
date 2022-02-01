import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class sizeOftree{
    public static void main(String[] args){
        Node root = createTree();
        System.out.println(size(root));
    }

    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        if(data == -1) return null;
        root = new Node(data);
        
        System.out.println("Enter the left to " + data);
        root.left = createTree();

        System.out.println("Enter the right to " + data);
        root.right = createTree();

        return root;
    }

    static int size(Node root) {
        if(root == null) return 0;

        return size(root.left) + size(root.right) + 1;
    }
}