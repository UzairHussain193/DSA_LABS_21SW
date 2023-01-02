import java.util.*;

public class Task2_Ticket_by_Age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = in.nextInt();
        if (age < 13) {
            System.out.println("Ticket is of $5");

        } else if (age >= 13 && age < 65) {
            System.out.println("Ticket is of $10");
        } else if (age >= 65) {
            System.out.println("Ticket is of $7");
        } else {
            System.out.println("Please enter valid age");
        }

    }

}
