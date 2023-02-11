import java.util.Scanner;
class Task_3<T>{
        static class Node<T>{
            Scanner sc = new Scanner(System.in);
            T data;
            Node next;
            Node current;
            Node pre;
            int size ;
            Node (T data){
                this.data = data;
                this.next = null;
                this.pre = null;
            }
        }
        private Node head;
        private int size;
        private Node current;
        public void push(T data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            } else if (head.next == null) {
                current = newNode;
                current.pre = head;
                head.next = current;
            }
            else {
                current.next = newNode;
                newNode.pre = current;
                current = newNode;
            }
        }
        public Object pop(){
            if(head==null){
                return null;
            }
            Object o = head.data;
            head = head.next;
            return o;
        }
        public Object peek(){
            return head.data;
        }

        public void backwarddisplay(){
            for(Node p = current ; p!=null; p = p.pre){
                System.out.println(p.data);
            }
        }
        public void forwardDisplay(){
            for(Node p = this.head ; p!=null; p = p.next){
                System.out.println(p.data);
            }
        }
}
