import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qs_621 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		for (int z = 0; z < num; z++) {
			String input = bf.readLine();
			if (input.equals("1") || input.equals("4") || input.equals("78")) {
				System.out.println("+");
			} else if (input.charAt(input.length() - 1) == '5' && input.charAt(input.length() - 2) == '3') {
				System.out.println("-");
			} else if (input.charAt(0) == '9' && input.charAt(input.length() - 1) == '4') {
				System.out.println("*");
			} else if (input.charAt(0) == '1' && input.charAt(1) == '9' && input.charAt(2) == '0') {
				System.out.println("?");
			}
		}
	}

}
