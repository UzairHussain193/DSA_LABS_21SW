
import java.util.Scanner;

class Search {

    public static void SingleSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("At index : " + i + " , we found number " + key);
                break;
            }
        }
    }

    public static void DoubleSearch(int[][] arr2, int key) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (key == arr2[i][j]) {
                    System.out.println("At index: (" + i + " , " + j + "), we found number " + key);
                }
            }
        }
    }

}

class Task1_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 6, 2, 9, 11, 76, 43 };
        int[][] arr2 = { { 23, 65 }, { 54, 32 }, { 2, 8 } };
        Search s = new Search();
        System.out.print("Enter number you want to search in 1D search: ");
        int key1 = sc.nextInt();
        long before1 = System.nanoTime();
        s.SingleSearch(arr, key1);
        long after1 = System.nanoTime();
        System.out.print("Enter number you want to search in 2D search: ");
        int key2 = sc.nextInt();
        long before2 = System.nanoTime();
        s.DoubleSearch(arr2, key2);
        long after2 = System.nanoTime();

        System.out.println("1D linear search method consuming :" + (after1 - before1) + " milliseconds");

        System.out.println("2D linear search method consuming :" + (after2 - before2) + " milliseconds");

    }

}