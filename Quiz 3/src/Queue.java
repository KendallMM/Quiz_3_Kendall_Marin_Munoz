public class Queue {
    private DoublyLinkedList queueList;

    // Class constructor
    public Queue() {
        queueList = new DoublyLinkedList();
    }
    // Method for enqueue
    public void enqueue(Object newElement) {
        this.queueList.insertLast(newElement);
    }
    // Method for dequeue
    public Object dequeue() {
        return this.queueList.deleteFirst();
    }
    // Method for peek the object in the front of the list
    public Node peek() {
        return this.queueList.getHead();
    }
    // Method for show de queue from Start to End
    public void ShowSE(){
        this.queueList.showSE();
    }
    // Method for show de queue from End to Start
    public void ShowES(){
        this.queueList.showES();
    }

    public static void main(String[] args) {
        // Create an empty queue
        Queue queue = new Queue();

        // Enqueue and dequeue some elements in the queue
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);
        System.out.println(queue.peek().getData());
        queue.ShowSE();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.ShowSE();
        queue.ShowES();
        System.out.println(queue.peek().getData());
    }
    /*
     * Author @Kendall Marín Muñoz
     * La implementación de la estructura Queue funciona correctamente y los resultados
     * al utilizar sus métodos fueron los esperados.
     */
}