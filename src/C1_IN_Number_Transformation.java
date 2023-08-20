import java.util.*;
import java.io.*;
public class C1_IN_Number_Transformation {
	
	static Scanner in;
	static PrintWriter out;
	static int n, p, ans;
	static int[] N;
	
	
	static void init() {
		n = Integer.valueOf(in.next());
		p = Integer.valueOf(in.next());
		
		String temp = Integer.toString(n);
		
		N = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			N[i] = temp.charAt(i) - '0';
		}
		
		//System.out.println(Arrays.toString(N));
	}
	
	
	static void solve() {
		//leftmost
		for (int i = 0; i < Integer.toString(n).length()-p; i++) {
			N[i] = (N[i] + N[Integer.toString(n).length()-p])%10;
		}
		//rightmost
		for (int i = Integer.toString(n).length()-p+1; i < Integer.toString(n).length(); i++) {
			N[i] = (Math.abs(N[i]-N[Integer.toString(n).length()-p]));
		}
		
		
		System.out.println(Arrays.toString(N));
	
	}
	

	public static void main(String[] args) throws IOException {
		in = new Scanner(System.in);
		
		init();
		solve();
		
		in.close();
		
	}
}
