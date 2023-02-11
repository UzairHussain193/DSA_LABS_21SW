import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task1_Factorial a=new Task1_Factorial();
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number for factorial: ");
        // int n=sc.nextInt();
        // System.out.println("The Factorial of: "+n+" is : "+(a.factorial(n)));

        // Task2_NNumbers b=new Task2_NNumbers();
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter limit numbers for printing: ");
        // int n=sc.nextInt();
        // b.printNumbers(n);

        // Task3_Fabonacci c=new Task3_Fabonacci();
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter limit numbers for fabonacci: ");
        // int z=sc.nextInt();
        // for (int i = 0; i < z; i++) {
        //     System.out.print(c.fibonacci(i) + " ");
        // }

        Task4_Binary_Search_Recurrsion d=new Task4_Binary_Search_Recurrsion();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target=sc.nextInt();
        int result = d.binarySearch(array, target, 0, array.length - 1);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } 
        else {
            System.out.println("Element found at index: " + result);
        }

    }
    
}
