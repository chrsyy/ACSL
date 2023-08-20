import java.util.*;
public class A0203_C1_JR_Asterisks {
	
	static Scanner in;
	static int n1, n2;
	static char c;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		init();
		solve();

	}
	
	static void init() {
		
		//if comma
		//String[] s = in.nextLine().split(", ");
		
		c = in.next().charAt(0);
		n1 = in.nextInt();
		if (c == 'B') n2 = in.nextInt();
		
		//System.out.println(c + " " + n1 + " " + n2);
	}
	
	static void solve() {
		
		if (c == 'S') {
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < n1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} 
		
		else if (c == 'H') {
			for (int i = n1; i > 0; i--) {
				
				for (int k = 0; k < n1 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		else if (c == 'L') {
			for (int i = 1; i <= n1; i++) {
				
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		else if (c == 'B') {
			for (int i = 0; i < n2; i++) {
				for (int j = 0; j < n1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}

}
