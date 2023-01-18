import javax.crypto.AEADBadTagException;

public class A<T> {

    private Node<T> head;

    public A() {
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void deleteValue(T value) {
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            if (current.data.equals(value)) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        A<Integer> list = new A<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Original list: ");
        list.display();

        int searchValue = 4;
        if (list.search(searchValue)) {
            System.out.println("\nValue " + searchValue + " found in the list");
        } else {
            System.out.println("\nValue " + searchValue + " not found in the list");
        }

        list.deleteValue(3);

        System.out.print("\nList after deleting value 3: ");
        list.display();
    }
}
