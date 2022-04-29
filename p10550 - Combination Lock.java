import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class qs_10550 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
       String input=bf.readLine();
       StringTokenizer token=new StringTokenizer(input," ");
       ArrayList<Integer>arr=new ArrayList<Integer>();
       while(token.hasMoreTokens()) {
    	  String str=token.nextToken();
    	  arr.add(Integer.parseInt(str));
       }
       int checkpoint1=arr.get(0);
       int checkpoint2=arr.get(1);
       int checkpoint3=arr.get(2);
       int checkpoint4=arr.get(3);
       int total=0;
       int current=0;
       for(int z=0;z<2;z++) {
    	   checkpoint1+=40;
    	   total+=40;
    	   if(checkpoint1>=40) {
    		   current=checkpoint1-40;
    	   }
       }
	  }
}
