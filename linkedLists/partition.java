









package linkedLists;

public class partition {

    static void part(LinkedList list, int num){
        
        list.append(num);
        Node head = list.head.next;
        while ( head.next != null ) {
            list.printNums();
            if(head.next.num < num){
                list.append(head.next.num);
                
                list.delete(head);
                
            }else{
                head = head.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.printNums();
        part(list, 8);
        list.printNums();
    }
    
}
