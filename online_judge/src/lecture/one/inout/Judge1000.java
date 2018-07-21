package lecture.one.inout;

import java.util.Scanner;

public class Judge1000 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//validation
		if(a<=0 || a>10) return;
		if(b<=0 || b>10) return;
		
		System.out.println(a+b);
	}

}
