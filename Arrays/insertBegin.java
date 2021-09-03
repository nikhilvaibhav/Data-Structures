class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class insertBegin{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node last = head;
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

    
        printList(head);
        delLast(head);
        System.out.println();
        printList(head);

        

    }
    //traverse and print the linked list

    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    // insert at the beginning

    static Node firstInsert(Node head, int element){
        Node newNode = new Node(element);
        newNode.next=head;
        head = newNode;
        return head;
    }
    //insert at the end

    static void lastInsert(Node head, Node last,  int element){
        Node newNode = new Node(element);
        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // delete first node
    static Node delFirst(Node head){
        if (head == null)
            return null;
        else
            return head.next;
    }

    //delete last node
    static void delLast(Node head){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
}