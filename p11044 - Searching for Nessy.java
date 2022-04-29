import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p11044 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String cases=bf.readLine();
        for(int z=0;z<Integer.parseInt(cases);z++) {
        	String input=bf.readLine();
        	String arr[]=input.split(" ");
        	int ans=(Integer.parseInt(arr[0])/3)*(Integer.parseInt(arr[1])/3);
        	System.out.println(ans);
        }
	  }
}
