package lecture.one.math;

import java.util.Scanner;

public class Judge2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Judge2609 m = new Judge2609();
		int gcd = m.gcd(a, b);
		int lcm = a*b/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
	
	public int gcd(int a, int b) {
		if (b==0) return a;
		else return gcd(b, a%b);
	}

}
