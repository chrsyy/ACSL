import java.util.*;

public class C0405_C1_JR_Poker {

	
	public static String Poker(String a) {
		int count = 1;
		String[] temp = a.split(", ");
		int hand [] = new int[5];
		for (int i = 0; i < temp.length; i++) {
			hand[i] = Integer.parseInt(temp[i])%13;
		}
		//check for pair, tok, and fok
		boolean pair = false;
		boolean tok = false;
		boolean fok = false;
		//boolean fh = false;
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				if (hand[i] == hand[j] && hand[j] != -1) {
					hand[j] = -1;
					count++;
				}
			}
			if (count == 2) {
				pair = true; 
			} else if (count == 3) {
				tok = true; 
			} else if (count == 4) {
				fok = true;
			} 
			count = 1;
		}
		

		
		if (pair && tok) return "FULL HOUSE";
		else if (pair) return "PAIR";
		else if (tok) return "THREE OF KIND";
		else if (fok) return "FOUR OF KIND";
		else return "NONE";
	}
	
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		
		String x = in.nextLine();
		System.out.println(Poker(x));
		
		in.close();
	}
}
