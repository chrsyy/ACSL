import java.util.*;
import java.io.*;
public class C1_IN_FibonacciClock {
	
	static Scanner in;
	static String file = "test", hoursans, minuteans;
	static String[] box;
	static int[] value;
	static int hours, minutes, ans;
	
	
	
	static void init() {
		box = new String[5];
		for (int i = 0; i < 5; i++) {
			box[i] = in.next();
		}
		
		value = new int[5];
		value[0] = 1;
		value[1] = 1;
		value[2] = 2;
		value[3] = 3;
		value[4] = 5;
	}
	
	
	static void solve() {
		hours = 0;
		minutes = 0;
		hoursans = "";
		
		for (int i = 0; i < 5; i++) {
			if (box[i].equals("R")) hours += value[i];
			if (box[i].equals("B")) hours += value[i];
			if (box[i].equals("B")) minutes += value[i];
			
			if (box[i].equals("G")) minutes += value[i];
			
			//System.out.println(minutes + " " + hours);
		}
		
		minutes = minutes * 5;
		
		
		if (minutes >= 60) {
			hours++;
			minutes = minutes%60; 
		}
		
		if (minutes < 10) {
			minuteans = "0" + minutes;
		} else if (minutes ==0) {
			minuteans = "00";
		} else minuteans = String.valueOf(minutes);
		
		if (hours < 10) {
			hoursans = "0" + hours;
		} else hoursans = String.valueOf(hours);
		
		System.out.println(hoursans + ":" + minuteans);
	
	}
	

	public static void main(String[] args) throws IOException {
		in = new Scanner(System.in);
		
		init();
		solve();
		
		in.close();

		
	}
}
