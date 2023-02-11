public class Main{
    public static void main(String[] args) {
        // Task_3 stack = new Task_3();
        // String[] url = {"1.facebook.com","2.linkedin.com","3.github.com"};
        // for(int i = 0; i<url.length;i++){
        //     stack.push(url[i]);
        // }
        // System.out.println("Forward Display");
        // stack.forwardDisplay();
        // System.out.println("BackWard Display");
        // stack.backwarddisplay();


            // Task Linkedstack methods main 
    //     // LinkedStack list=new LinkedStack<>();
    //     // list.push("HP");
    //     // list.push("Dell");
    //     // list.push("ASUS");
    //     // list.display();


            // Task ArrayStack methods main 
        ArrayStack a=new ArrayStack<>(3);
        a.push("A");
        a.push("B");
        a.push("C");
        a.display();
}
}