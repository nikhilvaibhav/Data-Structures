import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class cycleDetection2{
    public static void main(String args []){
        Node head = new Node(1);
        head.next = new Node(2);
        // head.next.next = new Node(30);
        // head.next.next.next = new Node(40);
        //head.next.next = head;

        System.out.println(cycle(head));
    }

    static int cycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                }
                return slow.data;
            }

        }
        
            return -1;
        
    }
}