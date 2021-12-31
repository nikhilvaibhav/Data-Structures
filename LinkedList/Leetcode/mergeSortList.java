class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class mergeSortList{
    public static void main(String[] args){
        Node head = new Node(50);
        head.next = new Node(40);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        display(head);
        System.out.println();
        Node res = merge(head);
        display(res);
    }

    static void display(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node merge(Node head){

        if(head == null || head.next == null) return head;


        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node first = head;
        Node second = slow.next;
        slow.next = null;

        Node l1 = merge(first);
        Node l2 = merge(second);

        return mergeSort(l1, l2);
    }

    static Node mergeSort(Node l1, Node l2){
        Node dummy_node = new Node(-1);
        Node temp = dummy_node;
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null){
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }

        return dummy_node.next;

    }
}