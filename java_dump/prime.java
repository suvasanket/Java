import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter lower range:");
		int lower = sc.nextInt();
		System.out.print("enter higher range:");
		int higher = sc.nextInt();

		for (int no = lower; no <= higher; no++) {
			for (int i = 2; i < no - 1; i++) {
				if (no % i == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.println(no);
			} else {
				temp = 0;
			}
		}
		sc.close();
	}
}
