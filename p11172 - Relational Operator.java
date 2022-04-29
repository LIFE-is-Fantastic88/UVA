import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qs_11172 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String n=bf.readLine();
        if(Integer.parseInt(n)<15) {
		for(int z=0;z<Integer.parseInt(n);z++) {
			String input=bf.readLine();
			String[]arr=input.split(" ");
			
				if(Integer.parseInt(arr[0])>Integer.parseInt(arr[1])) {
					System.out.println(">");
				}else if(Integer.parseInt(arr[0])<Integer.parseInt(arr[1])) {
					System.out.println("<");
				}else if(Integer.parseInt(arr[0])==Integer.parseInt(arr[1])) {
					System.out.println("=");
				}
		}
        }else {
        	System.exit(0);;
        }
	  }
}
