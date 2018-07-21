package lecture.one.inout;

import java.util.Scanner;

public class Judge11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
				
		sc.nextLine();
		String numbers = sc.nextLine();
		
		int res=0;
		
		for(int idx=0 ; idx<cnt ; idx++) {
			res += (numbers.charAt(idx)-'0'); 
		}
		System.out.println(res);
	}
}
