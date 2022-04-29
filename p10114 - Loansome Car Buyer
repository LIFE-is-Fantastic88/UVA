import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class qs_10114 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String input = bf.readLine();
			StringTokenizer token = new StringTokenizer(input);
			double loanyear = Double.parseDouble(token.nextToken());
			double downpayment = Double.parseDouble(token.nextToken());
			double loan = Double.parseDouble(token.nextToken());
			int cases = Integer.parseInt(token.nextToken());
			if (loanyear <= 0 || downpayment <= 0 && loan <= 0 && cases <= 0) {
				break;
			}

			double year = 0;
			double rate = 0.0;

			double latestcarprice = loan + downpayment;
			double monthlypayment = loan / loanyear;

			int result = 0;
			boolean flag = false;
			double curr = 0;
			double currvalue = 0;
			for (int z = 0; z < cases; z++) {
				if (flag) {
					bf.readLine();

					continue;
				}
				String input1 = bf.readLine();

				StringTokenizer token1 = new StringTokenizer(input1);
				year = Double.parseDouble(token1.nextToken());
				rate = Double.parseDouble(token1.nextToken());
				if (year == 0) {
					currvalue = 1 - rate;
					latestcarprice = latestcarprice * currvalue;
					curr++;
				}
				while (year > curr) {
					loan = loan - monthlypayment;
					latestcarprice = latestcarprice * currvalue;
					result++;
					curr++;
				}
				if (latestcarprice > loan) {
					if (result == 1) {
						sb.append(result).append(" month\n");
					} else
						sb.append(result).append(" months\n");
					flag = true;
					continue;
				}
				if (curr == year) {
					currvalue = 1 - rate;
					loan = loan - monthlypayment;
					latestcarprice = latestcarprice * currvalue;
					result++;
					curr++;
				}
				if (latestcarprice > loan) {
					if (result == 1) {
						sb.append(result).append(" month\n");
					} else
						sb.append(result).append(" months\n");
					flag = true;

				}
			}
			if (flag == false) {
				while (true) {
					loan = loan - monthlypayment;
					latestcarprice = latestcarprice * currvalue;
					result++;

					if (latestcarprice > loan) {
						if (result == 1) {
							sb.append(result).append(" month\n");
						} else
							sb.append(result).append(" months\n");
						break;
					}
				}
			}
		}
		System.out.print(sb);
	}
}
