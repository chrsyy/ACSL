import java.util.*;
import java.io.*;
public class C1_IN_Numeral_Triangles {
	
	static Scanner in;
	static int s, d, r, ans;
	
	
	
	static void init() {
		s = Integer.valueOf(in.next());
		d = Integer.valueOf(in.next());
		r = Integer.valueOf(in.next());
		
		
	}
	
	
	static void solve() {
		int ans = 0;
		int s10 = Integer.parseInt(String.valueOf(s), 8);
		int d10 = Integer.parseInt(String.valueOf(d), 8);
		//System.out.println(s8 + " " + d8);
		
		int rowcount = 0;
		for (int i = 2; i < r; i++) {
			rowcount += i;
		}
		
		int lastnum = s10 + d10*rowcount;
		//System.out.println(rowcount);
		//System.out.println(lastnum);

		int temp = 1;
		for (int i = 1; i < r*2; i+=2) {
			ans += Integer.parseInt(String.valueOf(lastnum + temp*d10), 8);
			temp++;
		}
		
		System.out.println(ans);
		System.out.println("h");
		
	
	}
	

	public static void main(String[] args) throws IOException {
		in = new Scanner(System.in);
		
		init();
		solve();
		
		in.close();
		
	}
}
