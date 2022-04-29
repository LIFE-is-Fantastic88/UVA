import java.util.Scanner;

public class qs_11942 {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int cases=sc.nextInt();
           System.out.println("Lumberjacks:");
           for(int z=0;z<cases;z++) {
        	   if(cases<0||cases>20)
        		   break;
        	
        	   int check=0;
        	   int asc=0;
        	   int dsc=0;
        	   boolean flag=false;
        	   for(int x=0;x<10;x++) {
        		   int input=sc.nextInt();
        		
        			 
        		   if(input>100) {
        			   flag=true;
        			   continue;
        		   }
        		   if(x==0) {
        			   check=input;
        		   }else {
        			   if(input>check) {
        				   dsc++;
        				   check=input;
        			   }
        			   else if(input<check) {
        				   asc++;
        				   check=input;
        			   }
        		   }
        	   }
        	   if(flag==true)
        		   break;
        	   else {
        	   if(asc==0&&dsc!=0||asc!=0&&dsc==0) {
        		   System.out.println("Ordered");
        	   }else if (asc!=0&&dsc!=0)
        		   System.out.println("Unordered");
           }
	      }
	  }
}
