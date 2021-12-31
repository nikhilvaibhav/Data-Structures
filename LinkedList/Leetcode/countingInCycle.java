
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class countingInCycle{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;

        System.out.print(loopCount(head));
    }

    static int loopCount(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 0;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                do{
                    count++;
                    slow = slow.next;
                }
                while(slow != fast);
                return count;
            }
        }
        return -1;
    }
}