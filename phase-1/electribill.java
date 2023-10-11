import java.util.Scanner;
public class electribill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  a = 50, b = 150, c = 250, d, e ;
        System.out.println("Enter unit");
        int unit = input.nextInt();
        if (unit <= a) {
            System.out.println(unit*5+"rs");
        } else if (unit >= a && unit <= b) {
            unit = unit - 50;
            d = (unit * 7) + 250;
            System.out.println(d+"rs");
        } else if (unit >= b && unit <= c) {
            unit = unit - 150;
            e = (unit * 9) + 250 + 700;
            System.out.println(e+"rs");
        } else if (unit >= c) {
            unit = unit - 250;
            e = (unit * 12) + 250 + 700 + 900;
            System.out.println(e+"rs");
        }
        input.close();

    }
}
