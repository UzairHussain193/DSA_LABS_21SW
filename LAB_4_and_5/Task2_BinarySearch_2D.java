import java.util.Arrays;
import java.util.Scanner;

class Test {
    void binary_search_2D(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                System.out.println("The row index is  " + row + "\n" + "The column index is " + col);
            }

            // Target lies in further row
            if (arr[row][col] < target) {
                row++;
            }
            // Target lies in previous column
            else {
                col--;
            }

        }

    }
}

class Task2_BinarySearch_2D {
    public static void main(String[] args) {
        Test t = new Test();
        Scanner sc = new Scanner(System.in);

        int[][] arr2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

        System.out.print("Enter number you want to search in 2D search: ");
        int key2 = sc.nextInt();
        long before2 = System.nanoTime();
        t.binary_search_2D(arr2, key2);
        long after2 = System.nanoTime();

        System.out.println("2D linear search method consuming :" + (after2 - before2)
                + " milliseconds");

    }
}
