public class Main{
    public static void main(String[] args) {
        // LinkedStack list=new LinkedStack<>();
        // list.push("HP");
        // list.push("Dell");
        // list.push("ASUS");
        // list.display();

        ArrayStack<String> a=new ArrayStack<>(3);
        a.push("A");
        a.push("B");
        a.push("C");
        a.display();

    }
}