import java.util.Scanner;

public class qs_573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double H = sc.nextInt();
			double U = sc.nextInt();
			double D = sc.nextInt();
			double F = sc.nextInt();
			if (H == 0) {
				break;
			}
			double percent = (F / 100) * U;
			double initialheight = 0;
			double distanceclimb = U;
			double heightafterclimb = 0;
			double heightafterslide = 0;
			int num = 1;
			while (true) {

				if (num == 1) {
					distanceclimb = U;
				} else {
					distanceclimb -= percent;
					if (distanceclimb < 0) {
						distanceclimb = 0;
					}
				}
				heightafterclimb = initialheight + distanceclimb;
				heightafterslide = heightafterclimb - D;
				initialheight = heightafterslide;
				if (heightafterclimb > H) {
					System.out.println("success on day " + num);
					break;
				} else if (heightafterslide < 0) {
					System.out.println("failure on day " + num);
					break;
				}
				num++;
			}
		}
	}
}
