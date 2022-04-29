import java.io.*;
import java.util.StringTokenizer;

public class qs_10300 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bf.readLine());
		for (int z = 0; z < cases; z++) {
			if (cases > 20)
				break;
			int farmer = Integer.parseInt(bf.readLine());
			if (farmer > 20 || farmer < 0)
				break;
			double answer = 0;
			for (int x = 0; x < farmer; x++) {
				String input = bf.readLine();
				StringTokenizer token = new StringTokenizer(input);
				double size = Double.parseDouble(token.nextToken());
				double animal = Double.parseDouble(token.nextToken());
				double friendliness = Double.parseDouble(token.nextToken());
				double avr = size / animal;
				double multiply = friendliness * animal;
				double total = avr * multiply;
				answer += total;
			}
			System.out.println((int) answer);
		}

	}

}
