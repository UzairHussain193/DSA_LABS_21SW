import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

interface Queue{
    public void add(Object obj);
    public Object first();
    public Object remove();
    public int size(); 
}

public class Task1_LinkedQueue implements Queue{
    private Node head=new Node();
    private int size;
    static class Node{
        Object object;
        Node prev=this;
        Node next=this;
        Node (){

        }
        Node(Object obj){
            this.object=obj;
        }
        Node(Object obj, Node n,Node p){
            object=obj;
            next=n;
            prev=p;
        }
    } 
    @Override
    public int size(){
        return size;
    }
    @Override
    public Object first(){
        if(size==0){
            throw new IllegalStateException();
        }
        return head.next.object;
    }
    @Override
    public void add(Object obj){
        head.prev.next=new Node(obj,head,head.prev);
        head.prev=head.prev.next;
        size++;
    }
    @Override
    public Object remove(){
        if(size==0){
            throw new IllegalStateException();
        }
        Object temp=head.next.object;
        head.next=head.next.next;
        head.next.prev=head;
        size--;
        return temp;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void displayTasks() {
        Node current = head.next;

        while (current != head) {
            System.out.println(current.object + " ");
            current = current.next;
        }
    }
}
