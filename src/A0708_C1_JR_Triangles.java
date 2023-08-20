import java.util.*;

public class A0708_C1_JR_Triangles {
	public static int Triangles(String a) {
		int n = 0;
		String[] temp = a.split(", ");
		int t1 [] = new int[3];
		for (int i = 0; i < 3; i++) {
			t1[i] = Integer.parseInt(temp[i]);
		}
		int t2 [] = new int[3];
		for (int i = 0; i < 3; i++) {
			t2[i] = Integer.parseInt(temp[i+3]);
		}
		//return Arrays.toString(t2);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (t1[i] == t2[j]) n++;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String x = in.nextLine();
		System.out.println(Triangles(x));
		
		in.close();

	}

}
