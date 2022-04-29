import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qs_1124 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input=bf.readLine();
			if(input==null)
				break;
			
			System.out.println(input);
		}

	}

}
