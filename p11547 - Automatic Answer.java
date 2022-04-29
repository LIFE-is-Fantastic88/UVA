import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p11547 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     String n=bf.readLine();
     for(int z=0;z<Integer.parseInt(n);z++) {
    	 String input=bf.readLine();
    	 int num=Integer.parseInt(input);
    	 int sum=((((((num*567)/9)+7492)*235)/47)-498);
    	 String get=Integer.toString(sum);
    	 System.out.println(get.charAt(get.length()-2));
     }
	}
}
