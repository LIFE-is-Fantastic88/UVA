import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p12279 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      int cases=1;
		while(true) {
    	   String n=bf.readLine();
    	   if(n.equals("0")) {
    		   break;
    	   }
    	  String input=bf.readLine();
    	  String arr[]=input.split(" ");
    	 
    	  int treat=0,untreat=0;
    	  for(int z=0;z<arr.length;z++) {
    		  if(Integer.parseInt(arr[z])==0) {
    			  treat++;
    		  }else {
    			  untreat++;
    		  }
    	  }
    	  System.out.println("Case "+cases+": "+(untreat-treat));
    	  cases++;
       }
	  }
}
