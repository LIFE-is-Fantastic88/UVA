import java.util.Scanner;
import java.util.StringTokenizer;

public class qs_12503 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int cases=Integer.parseInt(sc.nextLine());
     for(int z=0;z<cases;z++) {
    	 int times=Integer.parseInt(sc.nextLine());
    	 int[]arr=new int[times];
    	 int check=0;
    	 for(int x=0;x<times;x++) {
    		 String input=sc.nextLine();
    		 StringTokenizer token=new StringTokenizer(input);
    		 if(token.countTokens()==1) {
    			 String direction=token.nextToken();
    			 if(direction.equals("LEFT")) {
    				 check--;
    				 arr[x]=-1;
    			 }else if(direction.equals("RIGHT")) {
    				 check++;
    				 arr[x]=1;
    			 }
    		 }else {
    			 token.nextToken();
    			 token.nextToken();
    			 int copy=Integer.parseInt(token.nextToken());
    			 check+=arr[copy-1];
    			 arr[x]=arr[copy-1];
    		 }
    	 }
    	 System.out.println(check);
     }
	}
}
