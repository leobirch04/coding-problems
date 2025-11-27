package patterns;

class Node{

    Integer value;
    Node next;

    public Node(int value, Node next){
        this.next = next;
        this.value = value;
    }
}

class MinStack {

    private Node head;
    private Node min;
    

    public MinStack() {
        System.out.println("bob");
        this.head = null; 
        this.min = null; 
    }
    
    public void push(int val) {
        if (head == null) {
            this.head = new Node(val, null);
            this.min = head;
        }else {
            Node temp = this.head;
            this.head = new Node(val, temp);
            if (val <= this.min.value) {
                Node temps = this.min;
                this.min = new Node(val, temps);
            }
        }
        
    }
    
    public void pop() {
        System.out.println(this.head.value);
        if (this.head.value.equals(this.min.value)) {
            if (this.min.next == null) {
                this.min = this.head.next;
            }else{
                this.min = this.min.next;
                System.out.println(this.min);
            }
        }
        this.head = this.head.next;
    }
    
    public int top() {
        return this.head.value;
    }
    
    public int getMin() {
        return this.min.value;
    }
}
