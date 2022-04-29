import java.io.*;
import java.util.StringTokenizer;

public class qs_12015 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bf.readLine());
		for (int z = 0; z < cases; z++) {
			String[] google = new String[10];
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < 10; x++) {
				google[x] = bf.readLine();
			}
			int max = 0;
			for (int p = 0; p < google.length; p++) {
				StringTokenizer token = new StringTokenizer(google[p]);
				token.nextToken();
				int check = Integer.parseInt(token.nextToken());
				if (check > max) {
					max = check;
				}
			}
			sb.append("Case #" + (z + 1) + ":\n");
			for (int q = 0; q < google.length; q++) {
				StringTokenizer checktoken = new StringTokenizer(google[q]);
				String input1 = checktoken.nextToken();
				String input2 = checktoken.nextToken();
				if (Integer.parseInt(input2) == max) {
					sb.append(input1 + "\n");
				}
			}
			System.out.print(sb);
		}
	}
}
