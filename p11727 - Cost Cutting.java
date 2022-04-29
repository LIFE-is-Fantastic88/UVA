import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p11727 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n = bf.readLine();
		for (int z = 0; z < Integer.parseInt(n); z++) {
			String input = bf.readLine();
			String arr[] = input.split(" ");
			Integer num[] = new Integer[arr.length];
			for (int x = 0; x < num.length; x++) {
				num[x] = Integer.parseInt(arr[x]);
			}
			int temp;
			for (int y = 0; y < num.length; y++) {
				for (int q = y + 1; q < num.length; q++) {
					if (num[y] > num[q]) {
						temp = num[y];
						num[y] = num[q];
						num[q] = temp;
					}
				}
			}
			System.out.println("Case " + (z + 1) + ": " + num[1]);
		}
	}
}
