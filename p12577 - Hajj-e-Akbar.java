import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qs_12577 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		while (true) {
			String input = bf.readLine();
			if (input.equals("*")) {
				break;
			}
			if (input.equals("Hajj"))
				System.out.println("Case " + num + ": Hajj-e-Akbar");
			else if (input.equals("Umrah"))
				System.out.println("Case " + num + ": Hajj-e-Asghar");
			num++;
		}
	}
}
