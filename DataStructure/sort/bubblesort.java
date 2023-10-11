import java.util.Random;

public class bubblesort {
  public static void main(String[] args) {
    Random rn = new Random();
    int[] ar = new int[100];

    for (int i = 0; i < ar.length; i++) {
      ar[i] = rn.nextInt(1000);
    }

    System.out.println("before");
    printarray(ar);
    System.out.println("\n");

    // sorting logic
    boolean run = true;
    while (run == true) {
      run = false;
      for (int i = 0; i < ar.length - 1; i++) {
        if (ar[i] > ar[i + 1]) {
          run = true;
          int temp = ar[i];
          ar[i] = ar[i + 1];
          ar[i + 1] = temp;
        }
      }
    }
    System.out.println("after");
    printarray(ar);
  }

  static void printarray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
}
