package interfacess;
public class mainmethod {
    public static void main(String[] args) {
        System.out.println("which method do you want to see?");
        System.out.println("1.rabit");
        System.out.println("2.hawk");
        System.out.println("3.fish");
        System.out.println("4.all");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Integer a = scanner.nextInt();
        scanner.close();
        if (a == 1) {
            prey rabit = new rabit();
            rabit.flee();
        } else if (a == 2) {
            predator hawk = new hawk();
            hawk.hunt();
        } else if (a == 3) {
            prey smallfish = new fish();
            predator bigfish = new fish();
            smallfish.flee();
            bigfish.hunt();
        } else if (a == 4) {
            rabit rabit = new rabit();
            rabit.flee();
            hawk hawk = new hawk();
            hawk.hunt();
            fish fish = new fish();
            fish.flee();
            fish.hunt();
        } else {
            System.out.println("wrong input");
        }
    }
}
