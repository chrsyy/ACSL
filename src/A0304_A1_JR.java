import java.util.*;
public class A0304_A1_JR {
	static Scanner in;
	static int a[], max, maxIdx;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		init();
		solve();
	}
	
	static void init() {
		
		String s = in.next(); //132 <---- String
		
		a = new int[s.length()];
		
		for(int i = 0; i<s.length(); i++) {
			
			a[i] = s.charAt(i) - '0';
			
		}
		}
		
		
	static void solve() {
		max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxIdx = i;
			}
		}
		//System.out.println(maxIdx);
		//operation 
		if (max%2 == 1) a[maxIdx] = 0;
		else if (max%2 ==0) a[maxIdx] = (4+max)%10;
		
		//print answer
		if (a[0] == 0) {
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]);
			}
		}else {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		}
	
	}

}
