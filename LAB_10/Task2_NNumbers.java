class Task2_NNumbers {
    public static void printNumbers(int n) {
      if (n == 0) {
        return;
      } else {
        printNumbers(n - 1);
        System.out.print(n+" ");
      }
    }
}
  