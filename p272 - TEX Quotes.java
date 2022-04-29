import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class qs_272 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int check=1;
		String odd="``";
		String even="''";
		int inf=1;
		while(true) {
			String input = bf.readLine();
			if(input==null)
				break;
			for(int z=0;z<input.length();z++) {
			if(input.substring(z, z+1).equals("\"")) {
				if(check%2!=0) {
					
					System.out.print(odd);
				}else if(check%2==0) {
					
					System.out.print(even);
				}check++;
			}else {
				System.out.print(input.substring(z, z+1));
			}
			if(z==input.length()-1) {
				System.out.println();
			}
		  }
		}
	}
}
