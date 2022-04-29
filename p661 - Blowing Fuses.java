import java.util.Scanner;

public class qs_661 {
	private static class Device {
		int power;

		public Device(int inputpower) {
			power = inputpower;
		}

		int powerin() {
			return (power);
		}

		int powerout() {
			return (0 - power);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {

			StringBuilder sb = new StringBuilder();
			int number = sc.nextInt();
			int operation = sc.nextInt();
			int capacity = sc.nextInt();

			if (number == 0 && operation == 0 && capacity == 0)
				break;
			Device[] device = new Device[number];
			int[] check = new int[number];
			int electric = 0;
			for (int z = 0; z < number; z++) {
				int inputpower = sc.nextInt();
				device[z] = new Device(inputpower);
			}
			int max = 0;
			boolean flag = false;
			for (int x = 0; x < operation; x++) {
				int call = sc.nextInt();
				call -= 1;
				check[call]++;
				if (check[call] % 2 != 0) {
					electric += device[call].powerin();
				} else {
					electric += device[call].powerout();
				}
				if (electric > capacity) {

					flag = true;
					continue;
				} else {
					if (electric > max) {
						max = electric;
					}
				}
			}
			if (flag == false) {
				sb.append("Fuse was not blown.\n");
				sb.append("Maximal power consumption was " + max + " amperes.\n\n");
			} else {
				sb.append("Fuse was blown.\n\n");
			}
			num++;
			System.out.println("Sequence " + num);
			System.out.print(sb);
		}
	}
}
