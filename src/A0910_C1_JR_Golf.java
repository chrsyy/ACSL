import java.util.*;
public class A0910_C1_JR_Golf {
	public static void golf(int[] a) {
		int score = 0;
		for (int i = 0; i<4; i++) {
			int points = a[2*i +1] - a[2*i];
			score = score + points;
			if (points == 0) {
				System.out.println("par");
			} else if (points == -1) {
				System.out.println("birdie");
			} else if (points == -2) {
				System.out.println("eagle");
			} else if (points == 1) {
				System.out.println("bogey");
			} else if (points == 2) {
				System.out.println("double bogey");
			}
		}
		if (score == 0) {
			System.out.println("par");
		} else {
			System.out.println(score + " over par");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int temp[] = new int[8];
		for (int i = 0; i<4; i++) {
			String a = in.nextLine();
			String temp1[] = a.split(", ");
			temp[2*i] = Integer.parseInt(temp1[0]);
			temp[2*i+1] = Integer.parseInt(temp1[1]);
		}
		golf(temp);
		
		in.close();

	}

}
