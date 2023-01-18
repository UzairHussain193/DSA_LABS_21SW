class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Singly_linkedlist_lab7<T> {
    Node<T> head;
    int size;

    static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Singly_linkedlist_lab7() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(T data) {
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

    public void insertAtPosition(T data, int position) {
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

    public void deleteFirst() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {
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

    public void deleteAtPosition(int position) {
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
    
    public boolean search(T value) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        Node<T> current = head;
        System.out.print(" [ ");
       for(current=head;current!=null;current=current.next){
        System.out.print(current.data+" , ");
       }
       System.out.println(" ] ");
    }

    public static void main(String[] args) {
        Singly_linkedlist_lab7<Integer> p= new Singly_linkedlist_lab7<Integer>();

        System.out.println("Before iserting elements in linkedlist: Linkedlist is empty ->"+p.isEmpty());
        p.insertAtFirst(44);
        p.insertAtFirst(33);
        p.insertAtFirst(22);
        p.insertAtFirst(11);
        p.insertAtLast(55);
        System.out.println("After iserting elements in linkedlist: Linkedlist is empty ->"+p.isEmpty());
        System.out.println("Size of linkedlist is : "+p.getSize()); 
        p.display();
        System.out.println("Inseting 3 at first and 66 at last.");
        p.insertAtFirst(3);
        p.insertAtLast(66);
        System.out.println("After Adding:");
        p.display();
        p.insertAtPosition(19, 4);
        p.display();
        System.out.println(p.search(4));
        p.deleteFirst();
        p.display();
        p.deleteLast();
        p.display();
        p.deleteAtPosition(2);
        p.display();
        p.deleteValue(19);
        p.display();
        
        
    }
}