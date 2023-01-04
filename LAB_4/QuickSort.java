import java.util.Arrays;


public class QuickSort{
public void quickSort(int[] array, int low, int high) {
    if (array == null || array.length == 0){
        return;
    }
 
    if (low >= high){
        return;
    }
 
    // pick the pivot
    int middle = low + (high - low) / 2;
    int pivot = array[middle];
 
    // make left < pivot and right > pivot
    int i = low, j = high;
    while (i <= j) {
        while (array[i] < pivot) {
            i++;
        }
 
        while (array[j] > pivot) {
            j--;
        }
 
        if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
 
    // recursively sort two sub parts
    if (low < j){
        quickSort(array, low, j);
    }
    if (high > i){
        quickSort(array, i, high);
    }
}
public static void main(String[] args) {
    QuickSort qs=new QuickSort();
    int[] array = {10, 3, 2, 7, 8, 4, 1, 9, 6};
 
qs.quickSort(array, 0, array.length - 1);
System.out.println(Arrays.toString(array));
}
}