import java.util.Arrays;
import java.util.Scanner;

class BinSearch {

    static void DSearch(int[][] arr, int target) {
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

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinSearch b=new BinSearch();
        int[][] arr2 = { { 2, 5 }, { 7, 9 }, { 12, 15 } };
        Arrays.sort(arr2);

        System.out.print("Enter number you want to search in 2D search: ");
        int key2 = sc.nextInt();
        long before2 = System.currentTimeMillis();
       b.DSearch(arr2, key2);
        long after2 = System.currentTimeMillis();
        System.out.println("2D linear search method consuming :" + (after2 - before2)
        + " milliseconds");
    }

}
