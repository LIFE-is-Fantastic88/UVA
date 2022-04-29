import java.util.Scanner;

public class qs_12468 {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         while(true) {
        	 int input1=sc.nextInt();
        	 int input2=sc.nextInt();
        	 StringBuilder sb=new StringBuilder();
        	 if(input1==-1&&input2==-1)
        		 break;
        	 if(input1<=input2) {
        	 int difference1=(input1+100)-input2;
        	 int difference2=input2-input1;
        	 if(difference1<difference2) {
        		sb.append(difference1+"\n");
        	 }else {
        		 sb.append(difference2+"\n");
        	 }
         }else if(input1>input2){
        	 int difference1=(input2+100)-input1;
        	 int difference2=input1-input2;
        	 if(difference1<difference2) {
        		sb.append(difference1+"\n");
        	 }else {
        		 sb.append(difference2+"\n");
        	 }
         }System.out.print(sb);
         }
	    }
}
