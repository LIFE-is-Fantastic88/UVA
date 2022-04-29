import java.io.*;

public class qs_11332 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = bf.readLine();
			if (input.equals("0"))
				break;

			while (input.length() > 1) {
				int sum = 0;
				for (int z = 0; z < input.length(); z++) {
					sum += Character.getNumericValue(input.charAt(z));

				}
				input = Integer.toString(sum);

			}
			System.out.println(input);
		}
	}

}
