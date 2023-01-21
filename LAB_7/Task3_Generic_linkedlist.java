
class Task3_Generic_linkedlist<T extends Comparable<T>> {
    Node<T> head;
    int size;

    static class Node<T> {      // generic node class passing general data type of T
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Task3_Generic_linkedlist() {         // constructor to initialize head and size value
        head = null;
        size = 0;
    }

    public boolean isEmpty() {                  // method to check status of linkedlist
        return head == null;
    }

    public void getSize() {                      // it checks the size of linkedlist
        System.out.println("Size of linkedlist is: "+size); 
    }

    public void add(T data) {                   // adding elements in linkedlist, it adds at last generally
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtFirst(T data) {         // specific method to add element at start of linkedlist by adding new node 
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(T data) {          // specific method to add element at last of linkedlist by adding new node 
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insertAtPosition(T data, int position) {        // it insert at particular position by giving index
        Node<T> newNode = new Node<T>(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public void deleteFirst() {             // it deletes the very first elememnt in linkedlist
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {          // it deletes the last element
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                Node<T> temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;
        }
    }

    public void deleteAtPosition(int position) {            // it deletes the element at particular postion
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            int count = 0;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
        size--;
    }


    public void deleteValue(T value) {          //it deletes by value/element by searching
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
    
    public boolean search(T value) {            // it searches the element in linkeedlist
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T findLargest() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        T max = head.data;
        Node<T> current = head.next;
        while (current != null) {
            if (current.data.compareTo(max) > 0) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public T findLowest() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        T min = head.data;
        Node<T> current = head.next;
        while (current != null) {
            if (current.data.compareTo(min) < 0) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public void display() {             //method to display linkedlist
        Node<T> current = head;
        System.out.print(" [ ");
       for(current=head;current!=null;current=current.next){
        System.out.print(current.data+" , ");
       }
       System.out.println(" ] ");
    }

    public static void main(String[] args) {
        Task3_Generic_linkedlist<Integer> t=new Task3_Generic_linkedlist<Integer>();

        t.getSize();
        t.add(2);
        t.add(7);
        t.add(8);

        // checking list state (empty or having some elements)
        System.out.println(t.isEmpty());
        // displaying
        t.display();
        // inserting at first and last
        t.insertAtFirst(1);
        t.insertAtLast(10);
        // inserting at specific postition
        t.insertAtPosition(4, 2);
        //displaying list again
        t.display();
        // checking size of list
        t.getSize();
        //finding largest element in list
        System.out.println(t.findLargest());
        //finding lowest element in list
        System.out.println(t.findLowest());
        //searching by number 
        System.out.println(t.search(7));
        //deleting at specific position and deleting value directly
        t.deleteAtPosition(2);
        //deleting first and last
        t.deleteFirst();
        t.deleteLast();
        //displaying list again
        t.display();
        //deleting value directly
        t.deleteValue(2);
        //displaying list again
        t.display();
        
    }
}