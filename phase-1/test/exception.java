package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);

        try {
            System.out.println("enter a number");
            int i = sacn.nextInt();
            System.out.println(i);
            int j = sacn.nextInt();
            System.out.println(j);
        } catch (InputMismatchException ex) {
            System.out.println("you must enter a number");

        } finally {
            sacn.close();
        }
    }
}