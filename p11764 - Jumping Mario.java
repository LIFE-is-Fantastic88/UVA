import java.util.Scanner;

public class qs_11764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sample = sc.nextInt();
		for (int z = 0; z < sample; z++) {
			int amt = sc.nextInt();
			int high = 0;
			int low = 0;
			int curr = 0;
			for (int x = 0; x < amt; x++) {
				int input = sc.nextInt();
				if (x > 0) {
					if (input > curr) {
						high++;
					} else if (input < curr)
						low++;
					curr = input;
				} else if (x == 0) {
					curr = input;
				}
			}
			System.out.println("Case " + (z + 1) + ": " + high + " " + low);
		}
	}
}
