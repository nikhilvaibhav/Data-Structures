class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class intersectionOfList{
    public static void main(String[] args){
        Node head = new Node(50);
        head.next = new Node(40);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        display(head);
    }
    static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int intesection(Node head1, Node head2){
        
    }
}