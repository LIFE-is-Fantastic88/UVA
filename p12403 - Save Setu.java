import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qs_12403 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int sum = 0;
		for (int z = 0; z < num; z++) {
			String input = bf.readLine();
			String[] arr = input.split(" ");
			if (arr[0].equals("donate")) {
				sum += Integer.parseInt(arr[1]);
			} else if (arr[0].equals("report")) {
				System.out.println(sum);
			}
		}
	}
}
