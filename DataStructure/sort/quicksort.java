package sort;

import java.util.Random;

public class quicksort {

  static void sort(int[] ar, int lowindex, int highindex) {
    if (lowindex >= highindex) {
      return;
    }
    int pivot = ar[highindex];
    int lp = lowindex;
    int rp = highindex;

    while (lp < rp) {
      while (ar[lp] <= pivot && lp < rp) {
        lp++;
      }
      while (ar[rp] >= pivot && lp < rp) {
        rp--;
      }
      swap(ar, lp, rp);
    }
    swap(ar, lp, highindex);
    sort(ar, lowindex, lp - 1);
    sort(ar, lp + 1, highindex);
  }

  private static void swap(int[] ar, int index1, int index2) {
    int temp = ar[index1];
    ar[index1] = ar[index2];
    ar[index2] = temp;
  }
  private static void print(int[] ar) {
    for (int i = 0; i < ar.length; i++) {
      System.out.println(ar[i]);
    }
  }

  public static void main(String[] args) {
    Random rn = new Random();
    int[] ar = new int[100];

    for (int i = 0; i < ar.length; i++) {
      ar[i] = rn.nextInt(1000);
    }
    System.out.println("before");
    print(ar);
    sort(ar, 0, ar.length - 1);
    System.out.println("after");
    print(ar);
  }
}
