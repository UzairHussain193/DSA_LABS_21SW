public class Task4_Binary_Search_Recurrsion {

    public static int binarySearch(int[] array, int target, int low, int high) {
      if (low > high) {
        return -1;
      }
  
      int mid = (low + high) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        return binarySearch(array, target, mid + 1, high);
      } else {
        return binarySearch(array, target, low, mid - 1);
      }
    }

  }
  