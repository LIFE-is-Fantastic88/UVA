import java.io.*;
import java.util.StringTokenizer;

public class qs_10324 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		while (true) {
			String input = bf.readLine();
			if (input==null || input.isEmpty())
				break;
			int times = Integer.parseInt(bf.readLine());
			if(times==0) {
				break;
			}
			System.out.println("Case " + num + ":");
			num++;
			for (int z = 0; z < times; z++) {
				String check = bf.readLine();
				StringTokenizer token = new StringTokenizer(check);
				boolean flag = true;
				int check1 = Integer.parseInt(token.nextToken());
				int check2 = Integer.parseInt(token.nextToken());
				int start = 0;
				int last = 0;
				if (check1 < check2) {
					start = check1;
					last = check2;
				} else if (check1 > check2) {
					start = check2;
					last = check1;
				} else if (check1 == check2) {
					start = check1;
					last = check2;
				}
				if(last>=input.length()) {
					flag=false;
				}
				else if (start == last) {
					flag = true;
				} else {
					while (true) {

						if (input.charAt(start) == input.charAt(start + 1)) {

						} else {
							flag = false;
							break;
						}
						start++;
						if (start == last) {
							break;
						}
					}
				}
				if (flag == false) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			}
		}
	}
}
