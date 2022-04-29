import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p12250 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		while (true) {
			String input = bf.readLine();
			if (input.equals("#")) {
				break;
			}
			if (input.equals("HELLO")) {
				System.out.println("Case " + num + ": ENGLISH");
			} else if (input.equals("HOLA")) {
				System.out.println("Case " + num + ": SPANISH");
			} else if (input.equals("HALLO")) {
				System.out.println("Case " + num + ": GERMAN");
			} else if (input.equals("BONJOUR")) {
				System.out.println("Case " + num + ": FRENCH");
			} else if (input.equals("CIAO")) {
				System.out.println("Case " + num + ": ITALIAN");
			} else if (input.equals("ZDRAVSTVUJTE")) {
				System.out.println("Case " + num + ": RUSSIAN");
			} else {
				System.out.println("Case " + num +": UNKNOWN");
			}
			num++;
		}
	}
}
