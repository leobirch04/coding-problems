package linkedLists;

class Node{
    String value;
    Node next;

    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }
}

public class LinkedList {
    Node head;

    public Node append(String str){
        Node temp = new Node(str, this.head);
        this.head = temp;
        return temp;
    }


    public void printList(){
        StringBuilder str = new StringBuilder();
        Node head = this.head;
        str.append(head.value);
        while(head.next != null){
            str.append(head.next.value);
            head = head.next;
        }
        System.out.println(str);
    }
    
}
