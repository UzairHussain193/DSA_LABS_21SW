import java.util.Scanner;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class Practice_Tasks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = s.nextLine();
        System.out.println("Enter last name: ");
        String lname = s.nextLine();

        System.out.println("Your email is : " + fname + "." + lname + "@muet.edu.pk");

        ArrayList<String> animal_list = new ArrayList<>();
        animal_list.add("Monkey");
        animal_list.add("Dog");
        animal_list.add("Cat");
        for (String animal : animal_list) {
            System.out.println(animal + "");
        }
    }

}