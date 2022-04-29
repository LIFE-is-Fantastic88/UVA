import java.io.*;
import java.util.StringTokenizer;

public class qs_11559 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String input = bf.readLine();
			if(input==null)
				break;
			StringTokenizer token = new StringTokenizer(input);
			int participant = Integer.parseInt(token.nextToken());
			int budget = Integer.parseInt(token.nextToken());
			int hotel = Integer.parseInt(token.nextToken());
			int week = Integer.parseInt(token.nextToken());
			int min = 500000;
			if(participant<1||participant>200||budget<1||budget>500000||hotel<1||hotel>18||week<1||week>13)
				break;
			boolean lastcheck = false;
			
			for (int z = 0; z < hotel; z++) {
				int priceperone=Integer.parseInt(bf.readLine());
				int perprice =priceperone * participant;
				String room = bf.readLine();
				if(priceperone<1||priceperone>10000)
					continue;
				boolean flag = false;
				boolean sample=false;
				StringTokenizer check = new StringTokenizer(room);
				while (check.hasMoreTokens()) {
					int samplecheck=Integer.parseInt(check.nextToken());
					if(samplecheck<0||samplecheck>1000) {
						sample=true;
						break;
					}
					if (samplecheck > participant) {
						flag = true;
						break;
					}
				}if(sample==true)
					continue;
				if (flag == true && perprice <= budget && perprice < min) {
					min = perprice;
					lastcheck = true;
				}
			}
			if (lastcheck == false) {
				System.out.println("stay home");
			} else {
				System.out.println(min);
			}
		}
	}
}
