class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = next;
    }
}

public class ReverseLinkedList{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        display(head);
        System.out.println();
        Node prev = reverse(head);
        display(prev);
    }

    static Node reverse(Node head){
        Node prev = null;

        while(head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            
        }
    }
}