package linkedLists;

public class deleteNode {

    public static void delete(Node node){
        Node next = node.next;
        node.value = next.value;
        node.next = next.next;
    }
    

    public static void main (String[] args) {

        LinkedList list = new LinkedList();
        list.append("a");
        Node temp = list.append("a");
        list.append("h");
        list.append("h");
        list.append("a");
        list.append("t");
        list.printList();
        delete(temp);
        list.printList();

    } 

}
