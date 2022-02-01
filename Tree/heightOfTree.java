import java.util.Scanner;

class Node{
    int data;
    Node right, left;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class heightOfTree{
    public static void main(String[] args){
        Node root = createTree();
        System.out.println(height(root));
    }

    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter the left of " + data);
        root.left = createTree();

        System.out.println("Enter the right of " + data);
        root.right = createTree();

        return root;

        
    }

    static int height(Node root){
        if(root == null) return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}