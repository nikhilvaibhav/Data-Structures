class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicate{
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(10);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(50);

        display(head);
        duplicate(head);
        System.out.println();
        display(head);
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    static void duplicate(Node head){
        if(head == null){
            return;
        }
        Node temp = head;

        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
            
        }
    }
}