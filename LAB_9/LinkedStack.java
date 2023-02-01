class LinkedStack<T> {
    private Node<T> head;
    private Node pNode;
    private int size;
 
    private class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedStack() {
        head = null;
    }
    
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }
    
        public T pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            T data = head.data;
            head = head.next;
            return data;
        }
    
        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            return head.data;
        }
    
        public boolean isEmpty() {
            return head == null;
        }
    
        public int search(T data) {
            int position = 0;
            Node<T> current = head;
            for(current=head;current!=null;current=current.next){
                if(current.data.equals(data)){
                    return position;
                }
                position++;
            }
            return -1;
        }
    }