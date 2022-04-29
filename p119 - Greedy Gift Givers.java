import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class qs_119 {

	private static class player {
		String name;
		int money;

		private player(String nextToken) {
			name = nextToken;
			money = 0;
		}

		private void moneyspend(int spendage) {
			money -= spendage;

		}

		private void moneyreceive(int receive) {
			money += receive;
		}

		private void print() {
			System.out.println(name + " " + money);
		}
	}
	public static void main(String[] args)throws Exception {
	
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int b=0;
	while (true) {
			String input11 = sc.readLine();
			
			if (input11 == null||input11.isEmpty())
				break;
			
			int cases = Integer.parseInt(input11.trim());
            if(b>0)
            	System.out.println();
            b++;
			ArrayList<player> player = new ArrayList<player>();
			ArrayList<String> namelist = new ArrayList<String>();
			String input = sc.readLine();
			StringTokenizer token = new StringTokenizer(input);
			while (token.hasMoreTokens()) {
				String store = token.nextToken();
				player.add(new player(store));
				namelist.add(store);
			}
			for (int x = 0; x < cases; x++) {
				String start = sc.readLine();
				StringTokenizer token1 = new StringTokenizer(start);
				String gifter = token1.nextToken();
				int check = namelist.indexOf(gifter);
				int moneypaid = Integer.parseInt(token1.nextToken());
				int person = Integer.parseInt(token1.nextToken());
				int calculate = 0;
				int storecalculate = 0;
				if (person == 0 || moneypaid == 0) {

				} else {
					calculate = (moneypaid / person) * person;
					storecalculate = moneypaid / person;
					player.get(check).moneyspend(calculate);
					for (int y = 0; y < person; y++) {
						int accepter = namelist.indexOf(token1.nextToken());
						player.get(accepter).moneyreceive(storecalculate);
					}
				}
			}
			for (int q = 0; q < player.size(); q++) {
				player.get(q).print();
			}
		}
	}
}
