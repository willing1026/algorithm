package lecture.one.inout;

import java.util.Scanner;

public class Judge11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		//st,end idx�� ����ϸ鼭 ����?
		int len = line.length();
		int cnt = len/10;
		
		int stIdx=0;
		
		for(int idx=0 ; idx<cnt ; idx++) {
			System.out.println(line.substring(stIdx, stIdx+10));
			stIdx+=10;
		}
		System.out.println(line.substring(stIdx,len));
	}
}
