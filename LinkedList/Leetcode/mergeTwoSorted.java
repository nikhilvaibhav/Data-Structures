class Node{
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class mergeTwoSorted{
    public static void main(String[] args){
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);

        Node head2 = new Node(15);
        head2.next = new Node(25);
        head2.next.next = new Node(35);

        display(head1);
        System.out.println();
        display(head2);
        Node res = merge(head1, head2);
        System.out.println();
        display(res);
    }

    static void display(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node merge(Node head1, Node head2){
        Node dummy_node = new Node(-1);
        Node temp = dummy_node;

        while (head1 !=  null && head2 != null){
            if(head1.data <= head2.data){
                Node new_node = new Node(head1.data);
                temp.next = new_node;
                temp = temp.next;
                head1 = head1.next;
            }
            else{
                Node new_node = new Node(head2.data);
                temp.next = new_node;
                temp = temp.next;
                head2 = head2.next;
            }

            
        }

        while(head1 != null){
            Node new_node = new Node(head1.data);
            temp.next = new_node;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null){
            Node new_node = new Node(head2.data);
            temp.next = new_node;
            temp = temp.next;
            head2 = head2.next;
        }

        return dummy_node.next;
    }

}