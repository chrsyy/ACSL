import java.util.*;
import java.io.*;
public class C0607_C1_Probability {
	
	static Scanner in;
	static boolean pickone, picktwo, replacement;
	static String input, pick, ans;
	static String[] inp;
	static int red, blue;
	
	
	static void init() {
		
		input = in.nextLine();
		input = input.replace(",","");
		
		inp = new String[6];
		inp = input.split(" ");
		
		//System.out.println(Arrays.toString(inp));
		
		if (Integer.valueOf(inp[0]) == 1) {
			pickone = true;
		} else picktwo = true;
		
		red = Integer.valueOf(inp[1]);
		blue = Integer.valueOf(inp[2]);
		
		if (picktwo) {
			if (inp[3].equals("Y")) {
				replacement = true; 
			} else replacement = false;
		}
		
		//System.out.println(pickone + " " + picktwo + " " + replacement + red + blue);
	
	}
	
	
	
	static void solve() {
		if (pickone) {
			pick = inp[3];
			if (pick.equals("R")) {
				ans = red + "/" + (red + blue);
			} else if (pick.equals("B")) {
				ans = blue + "/" + (red + blue);
			}
		}
		if (picktwo) {
			pick = inp[4] + inp[5];
			//System.out.println(pick);
			
			int rb = red + blue;
			//System.out.println("rb: " + rb);
			if (!replacement) {
				if (pick.equals("RR")) {
					ans = red * (red-1) + "/" + (red + blue) * (red-1 + blue);
				} else if (pick.equals("BB")) {
					ans = blue * (blue-1) + "/" + (red + blue) * (blue-1 + red);
				} else if(pick.equals("RB") || pick.equals("BR")) {
					ans = red * blue + "/" + ((red + blue) * (red-1 + blue));
				}
			}
			if (replacement) {
				if (pick.equals("RR")) {
					ans = red * red + "/" + rb*rb;
				} else if (pick.equals("BB")) {
					ans = blue * blue + "/" + rb*rb;
				} else if(pick.equals("RB") || pick.equals("BR")) {
					ans = red * blue + "/" + rb*rb;
				}
			}
		}
		System.out.println(ans);
	
	}
	

	public static void main(String[] args) throws IOException {
		in = new Scanner(System.in);

		
		init();
		solve();
		
		in.close();

		
	}
}
