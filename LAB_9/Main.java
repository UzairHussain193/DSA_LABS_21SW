public class Main{
    public static void main(String[] args) {
        // LinkedStack list=new LinkedStack<>();
        // list.push("HP");
        // list.push("Dell");
        // list.push("ASUS");
        // System.out.println(list.peek());


        ArrayStack a=new ArrayStack<>(3);
        a.push("Apple");
        a.push("Google");
        a.push("Microsoft");
        System.out.println(a.peek()); 
    }
}