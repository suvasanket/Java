import java.util.Scanner;

public class binary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter decimal:");
    int n = sc.nextInt();
    int bin = 0, rem = 0, i = 1;
    while (n != 0) {
      rem = n % 2;
      n /= 2;
      bin = bin + rem * i;
      i *= 10;
    }
    System.out.println("binary : " + bin);
    sc.close();
  }

  @Override
  public String toString() {
    return "binary []";
  }
}
