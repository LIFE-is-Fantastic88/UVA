import java.io.*;
import java.util.StringTokenizer;

public class qs_11679 {

	public static void main(String[] args)throws Exception {
          BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	      while(true) {
	    	  String input=bf.readLine();
	    	  StringTokenizer token=new StringTokenizer(input);
	    	  int hotel=Integer.parseInt(token.nextToken());
	    	  int debentures=Integer.parseInt(token.nextToken());
	    	  if(hotel==0&&debentures==0)
	    		  break;
	    	  int []hotelcheck=new int [hotel+1];
	    	  hotelcheck[0]=0;
	    	  String monetary=bf.readLine();
	    	  StringTokenizer check=new StringTokenizer(monetary);
	    	  for(int z=1;z<=hotel;z++) {
	    		  hotelcheck[z]=Integer.parseInt(check.nextToken());
	    	  }
	    	  boolean flag=false;
			for (int x = 0; x < debentures; x++) {
				String perinput = bf.readLine();
				StringTokenizer solution = new StringTokenizer(perinput);
				int hotel1 = Integer.parseInt(solution.nextToken());
				int hotel2 = Integer.parseInt(solution.nextToken());
				int liability = Integer.parseInt(solution.nextToken());

				hotelcheck[hotel1] -= liability;
				hotelcheck[hotel2] += liability;
				if (x == debentures - 1) {
					
					for (int p = 1; p < hotelcheck.length; p++) {
						
						if (hotelcheck[p] < 0) {
							flag = true;
						break;
						}
					}
				}
			}
			if (flag == false)
				System.out.println("S");
			else
				System.out.println("N");
		}

	}

}
