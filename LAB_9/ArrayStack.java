
import java.util.NoSuchElementException;

public class ArrayStack<T> {
    private T[] stack;
    private int peek;       // peek is the index number
    private int size;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];     // we can not create an array of generic class so we type casted here
        peek = -1;
        size=0;
    }

    public void push(T data) {
        if (peek == capacity - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++peek] = data;
        peek++;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stack[peek--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stack[peek];
    }

    public boolean isEmpty() {
        return peek == -1;
    }

    public int search(T data) {
        for (int i = peek; i >= 0; i--) {
            if (stack[i].equals(data)) {
                return peek - i + 1;
            }
        }
        return -1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        for (int i = peek; i >= 0; i--) {
           System.out.println(stack[i]);
        }
    }
}
