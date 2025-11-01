package linkedLists;

class Node{
    String value;
    Node next;
    int num;

    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }

    public Node(int value, Node next){
        this.num = value;
        this.next = next;
    }
}

public class LinkedList {
    Node head;

    public Node append(int str){
        Node temp = new Node(str, this.head);
        this.head = temp;
        return temp;
    }

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

    public  void delete(Node node){
        Node next = node.next;
        node.value = next.value;
        node.next = next.next;
    }

    public void printNums(){
        StringBuilder str = new StringBuilder();
        Node head = this.head;
        str.append(head.num);
        while(head.next != null){
            str.append(head.next.num);
            head = head.next;
        }
        System.out.println(str);
    }
    
}
