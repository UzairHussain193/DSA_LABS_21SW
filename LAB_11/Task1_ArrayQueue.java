public class Task1_ArrayQueue {
    int[] queue;
    int front; // index of the front element
    int rear;  // index of the rear element
    int size;  // current size of the queue

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int size() {
        return size;
    }

    public Task1_ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;      // starting element index
        rear = -1;      // last element index
        size = 0;
    }
    public void enqueue(int value) {             /// add method
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {              ///remove method removes from front
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    public static void printQueue(Task1_ArrayQueue queue) {
        System.out.print("Queue: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.queue[(queue.front + i) % queue.queue.length] + " ");
        }
        System.out.println();
    }
}
