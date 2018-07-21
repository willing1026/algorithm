package lecture.one.inout;

import java.util.Scanner;

public class Judge10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(true) { //숫자이외의 값이 들어오면 에러 발생
		while(sc.hasNextInt()) { //숫자가 아닌경우 false
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) break;
			
			System.out.println(a+b);
		}
	}
}
