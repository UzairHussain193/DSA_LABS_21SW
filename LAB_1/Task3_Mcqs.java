import java.util.*;

public class Task3_Mcqs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Q: Who is the founder of Pakistan: ");
        String option1 = "Quiad-e-Azam";
        String option2 = "Allama Iqbal";
        String option3 = "Anonymous";
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);

        System.out.println("Enter choice (1,2,3): ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("Correct Answer");
        } else if (choice == 2) {
            System.out.println("Answer is wrong");
        } else if (choice == 3) {
            System.out.println("Answer is wrong");
        } else {
            System.out.println("Invalid choice");
        }

    }

}
