import java.io.*;
import java.util.StringTokenizer;

public class qs_11799 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());

		for (int z = 1; z <= input; z++) {
			int max = 0;
			String input2 = bf.readLine();
			StringTokenizer token = new StringTokenizer(input2);
			int cases = Integer.parseInt(token.nextToken());
			for (int x = 0; x < cases; x++) {
				int check = Integer.parseInt(token.nextToken());
				if (check > max) {
					max = check;
				}
			}
			System.out.println("Case " + z + ": " + max);
		}

	}

}
