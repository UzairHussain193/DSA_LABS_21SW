import java.util.*;

class Practice {
    int[] inputArray() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = s.nextInt();
        }
        return arr;

    }

    void outputArray(int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

    void search(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter elements to search: ");
        int x = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Found");
                break;
            } else {
                System.out.println("Sorry");
            }
        }
    }

    void menu() {
        System.out.println("1. Input Array");
        System.out.println("2. Output Array");
        System.out.println("3. Search Array");
    }

}

public class Lab2 {
    public static void main(String[] args) {
        Practice a = new Practice();
        a.search(a.inputArray());

    }
}