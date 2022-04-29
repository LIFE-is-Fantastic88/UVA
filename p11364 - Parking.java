import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class p11364 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String cases=bf.readLine();
        for(int z=0;z<Integer.parseInt(cases);z++) {
        	String input=bf.readLine();
        	String location=bf.readLine();
        	String arr[]=location.split(" ");
        	int max=0;
        	int min=100;
        	for(int x=0;x<arr.length;x++) {
        		if(Integer.parseInt(arr[x])>max) {
        			max=Integer.parseInt(arr[x]);
        		}
        		if(Integer.parseInt(arr[x])<min) {
        			min=Integer.parseInt(arr[x]);
        		}
        	}System.out.println((max-min)*2);
        	
        }
	  }
}
