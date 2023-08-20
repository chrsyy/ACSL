import java.util.*;
public class diceGame {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int current = 10;
		int bet = 0;
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		while(current >= 0) {
			do {
				System.out.println("Input bet money between $1 and $4");
				bet = in.nextInt();
			} while(0>bet || bet > 4 || bet > current);
			
			if (bet == 0) {
				System.out.println("You fold this game");
				break;
			}
			d1 = r.nextInt(6) + 1;
			d2 = r.nextInt(6) + 1;
			d3 = r.nextInt(6) + 1;
			System.out.println("Die #1: " + d1);
			System.out.println("Die #2: " + d2);
			System.out.println("Die #3: " + d3);
			if (d1 == d2 && d1 == d3 && d2 == d3) {
				current = bet*10 + current;
				System.out.println("All dice are same! You got 10 times bet! " + bet*10);
			} else if (d1 == d2 || d2 == d3 || d1 == d3) {
				current = bet*7 + current;
				System.out.println("2 dice are same! You got 7 times bet! " + bet*7);
			} else if (d1%2 == d2%2 && d1%2 == d3%2 && d2 == d3) {
				current = bet * 5 + current;
				System.out.println("All dice are odd or even You got 5 times bet! " + bet*5);
			} else {
				System.out.println("All dice are different. You lost bet.");
				current = current - bet;
			}
			System.out.println("You have $" + current);
			
		}
		System.out.println("You have $" + current);
		
		in.close();
		
	}
	
}