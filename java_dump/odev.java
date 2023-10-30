import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a non-zero no:");
        int no = sc.nextInt();
        int k = no % 2;
        switch (k) {
        case 0:
            System.out.println("even");
            break;
        default:
            System.out.println("odd");
            break;
        }
        sc.close();
    }
}
