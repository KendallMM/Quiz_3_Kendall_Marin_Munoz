public class DoublyLinkedList {
    private Node head, tail;
    private int size;

    public DoublyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void insertFirst(Object data) {
        if (!isEmpty()) {
            this.head = new Node(data, this.head, null);
            this.head.next.prev = this.head;
            this.size++;
        } else {
            this.head = this.tail = new Node(data);
            this.size++;
        }

    }
    public void insertLast(Object data) {
        if (!isEmpty()) {
            this.tail = new Node(data, null, tail);
            this.tail.prev.next = this.tail;
            this.size++;
        } else {
            this.head = this.tail = new Node(data);
            this.size++;
        }
    }
    public void showSE(){
        if (!isEmpty()) {
            Node aux = this.head;
            while (aux!=null) {
                System.out.print("["+aux.getData()+"]");
                aux = aux.next;
            }
            System.out.println();
        }
    }
    public void showES(){
        if (!isEmpty()) {
            Node aux = this.tail;
            while (aux!=null) {
                System.out.print("["+aux.getData()+"]");
                aux = aux.prev;
            }
            System.out.println();
        }
    }
    public Node deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }
    public Node getHead() {
        return this.head;
    }
    /*
    public static void main(String[] args) {
        // Create an empty linked list
        DoublyLinkedList linked_list = new DoublyLinkedList();

        // Insert and delete some elements in the list
        linked_list.insertFirst(3);
        linked_list.insertLast(10);
        linked_list.insertFirst(20);
        linked_list.insertFirst(48);
        linked_list.insertFirst(6);
        linked_list.insertFirst(5);
        linked_list.insertLast(11);
        linked_list.deleteFirst();
        linked_list.showSE();

        // Get and print the size of the list.
        // It should match the number of elements we inserted
        System.out.println(linked_list.size);


    }*/
}
