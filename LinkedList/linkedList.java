
public class linkedList{
    private Node head;
    private int size;
    public void GiveSize(){
        System.out.print(this.size);
    }
     private class Node{
        private int data;
        private Node next;
        public Node (int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        size = size + 1;
    }

    public void insertPos(int value, int position){
        Node temp = head;
        for(int i=1; i<position; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size = size + 1;
    }

    public int search(int find){
        int position = 0;
        Node temp = head;
        while (temp != null){
            if(temp.data == find){
                return position;
            }
            else{
                position++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public int deleteFirst(){
        int value = head.data;
        head = head.next;

        size = size - 1;
        return value;
    }

    public void deleteLast(){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPos(int pos){
        Node temp = head;
        for(int i=0; i<position; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}