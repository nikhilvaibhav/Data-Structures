

public class Main{
    public static void main(String[] args){
        linkedList ll = new linkedList();
        ll.insertFirst(3);
        ll.insertFirst(30);
        ll.insertFirst(300);
        ll.insertFirst(31);
        ll.insertPos(54, 3);
        ll.display();
        System.out.println(); 
        ll.GiveSize();
        System.out.println();
        
        ll.deleteLast();
        ll.display();
        
    }
    
}