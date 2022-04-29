import java.util.Scanner;

public class qs_12554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		String birthday = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
		String[] song = birthday.split(" ");
		String[] arr = new String[cases];
		for (int x = 0; x < cases; x++) {
			arr[x] = sc.nextLine();
		}
		int check = 0;
		int loop = 0;
		int songnum = song.length;
		if ((double) cases % (double) songnum != 0) {
			loop = (int) (cases / songnum) + 1;
		} else {
			loop = (int) (cases / songnum);
		}
		int repeat = 0;
		int inf=0;
		while(true) {
			System.out.println(arr[inf] + ": " + song[repeat]);
			inf++;
			repeat++;
			if (repeat == 16) {
				check++;
				repeat = 0;
				if (check == loop) {
					break;
				}
			}
			if (inf==cases) {
				inf=0;
			}
		}
	}
}
