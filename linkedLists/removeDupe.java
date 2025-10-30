package linkedLists;

public class removeDupe {

    static void remove(LinkedList list){
        
        Node first = list.head; // create a pointer to the start of the list
        
        while(first != null && first.next != null){ // iterate through the list
            //System.out.println(first.value);
            Node second = first; // create a new pointer stating at the first
            while(second.next != null ){ // iterate through the list form this point
                if(first.value.equals(second.next.value)){ // check if the next has the same value
                    second.next = second.next.next; // change the pointer to go around the duplicate
                }
                else if(second.next != null && first.value.equals(second.next.value) && second.next.next == null){
                    second.next = null;
                }else{second = second.next;}
                
            }
            
            first = first.next;
        }
    }

    

    public static void main (String[] args) {

        LinkedList list = new LinkedList();
        list.append("a");
        list.append("a");
        list.append("h");
        list.append("h");
        list.append("a");
        list.append("t");
        list.printList();
        remove(list);
        list.printList();

        

    } 
}
