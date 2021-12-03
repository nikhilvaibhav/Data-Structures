import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoveFromEnd{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
       

        display(head);
        remove(head, 2);

        System.out.println();
        display(head);
    }

    static void display(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.print("NULL");
    }

    static Node remove(Node head, int pos){
        Node dummy_node = new Node(0);
        dummy_node.next = head;
        
        Node slow = dummy_node;
        Node fast = dummy_node;

        for(int i=1; i<=pos + 1; i++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy_node.next;
    }
}