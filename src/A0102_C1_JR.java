import java.util.*;

public class A0102_C1_JR {
	
	static Scanner in;
	public static void main(String[] args) {

        in = new Scanner(System.in);
        for (int i=0; i < 5; i++) solve();
	}
	static void solve() {
		int n = in.next().charAt(0) - 64;
        List<Integer> primes = new ArrayList<Integer>(); 
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        if (1 <= n && n <= 5){
        	n = 2 * n % 26;
        } else if (6 <= n && n <= 10) {
        	n = n % 3 * 5;
        } else if (11 <= n && n <= 15) {
        	n = n / 4 * 8;
        } else if (16 <= n && n <= 20) {
        	n= (n % 10 + n / 10) * 10 % 26;
        } else if (21 <= n && n <= 26) {
        	for (int i = 0; i < 6; i++) {
        		if (n % primes.get(i) == 0) {
        			n = n / primes.get(i) * 12 % 26;
        			break;
        		}
        	}
        } if (n == 0) {
        	n = 26;
        }
        System.out.println((char)(n + 64));
	}
}
/*
B
G
Z
T
K
*/
