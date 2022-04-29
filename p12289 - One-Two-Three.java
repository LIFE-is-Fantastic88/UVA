import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p12289 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for (int z = 0; z < n; z++) {
			String one = "one";
			String two = "two";
			String three = "three";
			String input = bf.readLine();
			int checkone = 0;
			int checktwo = 0;
			int checkthree = 0;
			if (input.length() == 3) {
				for (int x = 0; x < input.length(); x++) {
					if (input.substring(x, x + 1).equals(one.substring(x, x + 1))) {
						checkone++;
						if (checkone >= 2) {
							System.out.println("1");
							break;
						}
					}
					if (input.substring(x, x + 1).equals(two.substring(x, x + 1))) {
						checktwo++;
						if (checktwo >= 2) {
							System.out.println("2");
							break;
						}
					}
				}
			} else {
				for (int y = 0; y < input.length(); y++) {
					if (input.substring(y, y + 1).equals(three.substring(y, y + 1))) {
						checkthree++;
						if (checkthree >= 4) {
							System.out.println("3");
							break;
						}
					}
				}
			}
		}
	}
}
