import java.util.Scanner;

public class twosum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int k = 0; k < arr.length; k++) {
            System.out.println("enter array element " + (k+1));
            int y = input.nextInt();
            arr[k] = y;
        }
        System.out.println("enter target element");
        int target = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
        input.close();
    }
}