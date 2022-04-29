import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qs_12372 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int measurement = 20;
		int num = Integer.parseInt(bf.readLine());
		for (int z = 0; z < num; z++) {
			String input = bf.readLine();
			String[] arr = input.split(" ");
			for (int x = 0; x < arr.length; x++) {
				int check = Integer.parseInt(arr[x]);
				if (check <= 20) {

				} else {
					System.out.println("Case " + (z + 1) + ": bad");
					break;
				}
				if (x == arr.length - 1) {
					System.out.println("Case " + (z + 1) + ": good");
				}
			}
		}
	}
}
