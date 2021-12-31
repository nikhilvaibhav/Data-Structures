class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Palindrome{
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        //head.next.next.next.next = new Node(1);

        display(head);
        System.out.println();
        System.out.print(isPalindrome(head));
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow != null){
            if(slow.data != fast.data){
                return false;
            }
            slow = slow.next;
            fast = fast.next;       
        }
        return true;
    }

    static Node reverse(Node slow){
        Node prev_node = null;
        while (slow != null){
            Node next_node = slow.next;
            slow.next = prev_node;
            prev_node = slow;
            slow = next_node;
        }
        return prev_node;
    }
}