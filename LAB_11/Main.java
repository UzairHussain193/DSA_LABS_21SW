public class Main {
    public static void main(String[] args) {
        /// Array Queue
        // Task1_ArrayQueue aq= new Task1_ArrayQueue(5);

        // aq.enqueue(12);
        // aq.enqueue(22);
        // aq.enqueue(32);
        // aq.enqueue(42);
        // aq.enqueue(52);

        // aq.printQueue(aq);
        // aq.dequeue();
        // aq.printQueue(aq);

        /// Linked Queue
        Task1_LinkedQueue lq = new Task1_LinkedQueue();

        lq.add("Task1");
        lq.add("Task2");
        lq.add("Task3");

        lq.displayTasks();
    }
}
