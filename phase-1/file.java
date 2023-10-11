import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter yor fuckin name");
            String name = sc.nextLine();
            int r = (int) (Math.random() * 10);
            int s = (int) (Math.random() * 10);
            System.out.println("answer this " + r + " * " + s + "?");
            int c = sc.nextInt();
            if (c == r * s) {
                System.out.println("Congratulations");
            } else {
                System.out.println("you are thankfully wrong");
            }
            System.out.println("Hi " + name);
        }
    }
}