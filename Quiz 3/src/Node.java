public class Node {
    public Object data;
    public Node next, prev;

    public Node(Object data) {
        this(data, null, null);
    }
    public Node(Object info, Node n, Node p){
        data = info;
        prev=p;
        next=n;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }


}
