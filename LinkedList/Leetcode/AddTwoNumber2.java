class Node{
    int data;
    Node next;
     public Node(int data){
         this.data = data;
         this.next = null;
     }
}

public class AddTwoNumber2{
    public static void main(String[] args){
        Node head1 = new Node(7);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node result = sum(head1, head2);
        display(result);

    }

    static void display(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node reverse(Node head){

        Node prev = null;

        while(head != null){
            Node new_node = head.next;
            head.next = prev;
            prev = head;
            head = new_node;
        }
        return prev;
    }

    static Node sum(Node ptr1, Node ptr2){

        Node head1 = reverse(ptr1);
        Node head2 = reverse(ptr2);

        
        Node dummy_node = new Node(0);
        Node head3 = dummy_node;

        int carry = 0;
        while (head1 != null || head2 != null){
            int num1 = (head1 != null) ? head1.data : 0;
            int num2 = (head2 != null) ? head2.data : 0;

            int sum_current = num1 + num2 + carry;
            int last_digit = sum_current % 10;

            carry = sum_current / 10;

            Node new_node = new Node(last_digit);
            head3.next = new_node;
            head3 = head3.next;

            if(head1 != null){
                head1 = head1.next;
            }
            if(head2 != null){
                head2 = head2.next;
            }
            
        }

        if(carry > 0){
            Node new_node = new Node(carry);
            head3.next = new_node;
            head3 = head3.next;
        }


        return reverse(dummy_node.next);
    }
}