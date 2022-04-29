import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class qs_10424 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String alpha = "0abcdefghijklmnopqrstuvwxyz";
		DecimalFormat df = new DecimalFormat("0.00");
		while (true) {
			String input1 = bf.readLine();
			if(input1==null)
				break;
			String input2 = bf.readLine();
			input1 = input1.toLowerCase();
			input2 = input2.toLowerCase();
			
			if(input1.equals("")&&input2.equals("")) {
				System.out.println();
				continue;
			}
			double final1 = 0;
			double final2 = 0;
			int initial1 = 0; // inpu1
			for (int z = 0; z < input1.length(); z++) {
				char check = input1.charAt(z);
				if (Character.isLetter(check)) {
					int index = alpha.indexOf(check);
					initial1 += index;
				}
			}
			while (true) {
				String repeat = Integer.toString(initial1);
				if (repeat.length() == 1) {
					final1 = Double.parseDouble(repeat);
					break;
				} else {
					initial1 = 0;
					for (int z = 0; z < repeat.length(); z++) {
						initial1 += Integer.parseInt(repeat.substring(z, z + 1));
					}
				}
			}
			int initial2 = 0; // input2
			for (int x = 0; x < input2.length(); x++) {
				char check1 = input2.charAt(x);
				if (Character.isLetter(check1)) {
					int index1 = alpha.indexOf(check1);
					initial2 += index1;
				}
			}
			while (true) {
				String repeat = Integer.toString(initial2);
				if (repeat.length() == 1) {
					final2 = Double.parseDouble(repeat);
					break;
				} else {
					initial2 = 0;
					for (int z = 0; z < repeat.length(); z++) {
						initial2 += Integer.parseInt(repeat.substring(z, z + 1));
					}
				}
			}
			double percent = 0;
			if(final1==0&&final2==0) {
				System.out.println();
				continue;
			}
			if (final1 > final2)
				percent = (final2 / final1) * 100;
			else
				percent = (final1 / final2) * 100;
			if(percent%2==0) {
				System.out.println(percent + "0 %");
			}
			else
			System.out.println(df.format(percent) + " %");
		}
	}
}
