import java.util.Arrays;

class Sorts{

    // Bubble sort of 1D Array
    public int[] Bubble_Sort(int [] arr){     
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length-1; j++){        
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }     

    // Insertion Sort of 1D Array
    public int[] Insertion_Sort(int [] arr){
        for (int i=1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }        

    //Selction SOrt of 1D Array
    public int[] Selection_Sort(int [] arr){
        for (int i=0; i< arr.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }     
    
    // Quick Sort
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
        if (low < j)
            quickSort(array, low, j);
     
        if (high > i)
            quickSort(array, i, high);
    }
    public long TimeCalculator(long b, long a){
        return (a-b);
    }


}

public class Task1_1D_Sorting {
    public static void main(String[] args) {
        
        int [] array = {4, -6, 5, 7, 8, 9, 1, 10, -9};
        Sorts s = new Sorts();

        long before1 = System.nanoTime();
        System.out.println("Bubble Sort()  -->  "+Arrays.toString(s.Bubble_Sort(array)));
        long after1 = System.nanoTime();
        
        long before2 = System.nanoTime();
        System.out.println("Insertion Sort()  -->   "+Arrays.toString(s.Insertion_Sort(array)));
        long after2 = System.nanoTime(); 
            
        long before3 = System.nanoTime();
        System.out.println("Selection Sort()  -->   "+Arrays.toString(s.Selection_Sort(array)));
        long after3 = System.nanoTime();
        
        long before4 = System.nanoTime();
        s.quickSort(array, 0, array.length-1);
        System.out.println("Quick Sort()  -->   "+Arrays.toString(array));
        long after4 = System.nanoTime();
        
        System.out.println("\n\nExecution time of Bubble Sort() method is -->   "+s.TimeCalculator(before1, after1));
        System.out.println("Execution time of Insertion Sort() method is -->   "+s.TimeCalculator(before2, after2));
        System.out.println("Execution time of Selection Sort() method is -->   "+s.TimeCalculator(before3, after3));
        System.out.println("Execution time of Quick Sort() method is -->   "+s.TimeCalculator(before4, after4));
    }
}