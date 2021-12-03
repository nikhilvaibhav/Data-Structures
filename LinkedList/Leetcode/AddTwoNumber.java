import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumber{
    public static void main(String[] args){
            Node head1 = new Node(2);
            head1.next = new Node(4);
            head1.next.next = new Node(3);

            Node head2 = new Node(5);
            head2.next = new Node(6);
            head2.next.next = new Node(4);

            display(head1);
            System.out.println();
            display(head2);
            System.out.println();
            Node head3 = sum(head1, head2);
            display(head3);
    }

    static void display(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.print("NULL");
    }

   static Node sum(Node head1, Node head2){
       Node dummy_node = new Node(0);
       Node head3 = dummy_node;

       
        int carry = 0;
       while (head1 != null || head2 != null){
           int num1 = (head1 != null) ? head1.data : 0;
           int num2 = (head2 != null) ? head2.data : 0;

           int sum = num1 + num2 + carry;
           int last_digit = sum % 10;
           carry = last_digit / 10;

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
           Node node_node = new Node(carry);
           head3.next = node_node;
           head3 = head3.next;
       }

       return dummy_node.next;
   }
}