package lecture.one.inout;

import java.util.Scanner;

public class Judge11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t=1 ; t<=tc ; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+t+": "+a+" + "+b+" = "+ (a+b));
		}
	}
}
