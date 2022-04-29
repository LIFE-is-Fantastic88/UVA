import java.util.Scanner;

public class qs_12157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int z = 0; z < cases; z++) {
			int call = sc.nextInt();
			int mile = 0;
			int juice = 0;
			for (int x = 0; x < call; x++) {
				int input = sc.nextInt();
				input += 1;
				double milecheck = input;
				double juicecheck = input;
				if (milecheck % 30 != 0) {
					mile += (((int) milecheck / 30) + 1) * 10;
				} else {
					mile += ((int) milecheck / 30) * 10;
				}
				if (juicecheck % 60 != 0) {
					juice += (((int) juicecheck / 60) + 1) * 15;
				} else {
					juice += ((int) juicecheck / 60) * 15;
				}
			}
			StringBuilder sb = new StringBuilder();
			if (mile < juice) {
				sb.append("Case " + (z + 1) + ": Mile " + mile + "\n");
			} else if (juice < mile) {
				sb.append("Case " + (z + 1) + ": Juice " + juice + "\n");
			} else if (juice == mile) {
				sb.append("Case " + (z + 1) + ": Mile Juice " + juice + "\n");
			}
			System.out.print(sb);
		}
	}
}
