import java.util.Arrays;
import java.util.Scanner;

class BinSearch {

    static int SinSearch(int[] a, int x) {
        int p = 0;
        int q = a.length - 1;
        while (p <= q) {
            int i = (p + q) / 2;
            if (x == a[i]) {
                return i;
            } else if (a[i] < x) {
                p = i + 1;
            } else {
                q = i - 1;
            }
        }
        return -5;
    }

    // static void DSearch(int[][] arr, int target) {
    //     int row = 0;
    //     int col = arr[row].length - 1;
    //     while (row < arr.length && col >= 0) {
    //         if (arr[row][col] == target) {
    //             System.out.println("The row index is  " + row + "\n" + "The column index is " + col);
    //         }

    //         // Target lies in further row
    //         if (arr[row][col] < target) {
    //             row++;
    //         }
    //         // Target lies in previous column
    //         else {
    //             col--;
    //         }

    //     }
    // }

}

class Task2_BinarySearch_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 5, 6, 2, 9, 11, 76, 43 };
        Arrays.sort(arr1);
        // int[][] arr2 = { { 2, 5 }, { 7, 9 }, { 12, 15 } };
        // Arrays.sort(arr2);

        BinSearch b = new BinSearch();
        System.out.print("Enter number you want to search in 1D Binary search: ");
        int key1 = sc.nextInt();
        long before1 = System.nanoTime();
        System.out.println("Found at index: "+b.SinSearch(arr1, key1));
        long after1 = System.nanoTime();

        // System.out.print("Enter number you want to search in 2D search: ");
        // int key2 = sc.nextInt();
        // long before2 = System.currentTimeMillis();
        // System.out.println(b.DSearch(arr2, key2));
        // long after2 = System.currentTimeMillis();

        System.out.println("1D linear search method consuming :" + (after1 - before1)+ " milliseconds");
        // System.out.println("2D linear search method consuming :" + (after2 - before2)+ " milliseconds");
    }

}
