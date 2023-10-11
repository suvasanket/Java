import java.util.Scanner;

public class floyd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows:");
    int rows = sc.nextInt();
    int k = 1;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k++;
      }
      System.out.println(" ");
    }
    sc.close();
  }
}
