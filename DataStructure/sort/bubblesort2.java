public class bubblesort2 {
  public static void main(String[] args) {

    int[] ar = {1, 23, 56, 72, 54, 89, 100, 700, -1, 0};

    // algoriitm
    boolean run = true;

    while (run == true) {
      run = false;
      for (int j = 0; j < (ar.length) - 1; j++) {
        if (ar[j] > ar[j + 1]) {
          run = true;
          int temp = ar[j];
          ar[j] = ar[j + 1];
          ar[j + 1] = temp;
        }
      }
    }
    // print array
    for (int i = 0; i < ar.length; i++) {
      System.out.print(ar[i] + " ");
    }
  }
}
