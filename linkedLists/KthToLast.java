package linkedLists;

public class KthToLast {


    static String kth(LinkedList list, int k){
        Node node = list.head;
        Node head = list.head;
        int count1 = 1; int count2 = 0;

        while (node.next != null) {
            node = node.next;
            count1++;
            if (node.next == null) {
                while (count2 < (count1 - k)) {
                    head = head.next;
                    count2 ++;
                }
                return head.value;
            }
        }


        return "less than k items in list";
    }

    public static void main (String[] args) {

        LinkedList list = new LinkedList();
        list.append("h");
        list.append("h");
        list.append("t");
        list.append("a");
        list.append("h");
        list.append("t");
        list.printList();
        System.out.println(kth(list , 3));
        

        

    } 
}
