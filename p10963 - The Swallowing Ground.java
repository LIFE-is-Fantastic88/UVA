import java.io.*;
import java.util.StringTokenizer;

public class qs_10963 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine().trim());
		for(int z=0;z<cases;z++) {
			bf.readLine();
			
			int times=Integer.parseInt(bf.readLine().trim());
			int check=0;
			boolean flag=false;
			for(int x=0;x<times;x++) {
				String input=bf.readLine();
				StringTokenizer token=new StringTokenizer(input);
				int input1=Integer.parseInt(token.nextToken());
				int input2=Integer.parseInt(token.nextToken());
				
				int answer=input2-input1;
				if(x==0) {
					check=answer;
				}
				if(answer!=check) {
				    flag=true;
				    
				}
				
			}
			if(flag==true) {
				System.out.println("no");
			}else
				System.out.println("yes");
			if(z<cases-1)
			System.out.println();
			
		}

	}

}
