class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class insertInSorted{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        display(head);
        insert(head,35);
        System.out.println();
        display(head);
    }
    static void display(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void insert(Node head, int val){
        Node temp = head;

        while (temp != null && temp.next.data < val){
            temp = temp.next;
        }

        Node new_node = new Node(val);
        new_node.next = temp.next;
        temp.next = new_node;
    }

    

}