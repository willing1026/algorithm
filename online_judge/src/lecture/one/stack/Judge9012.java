package lecture.one.stack;

import java.util.Scanner;

public class Judge9012 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		
		while(tc>0) {
			String line = sc.nextLine();
			int cnt = 0;
			int offset = 0;
			int length = line.length();

			while(offset < length) {
				//( 를 만나면 cnt++
				if('(' == line.charAt(offset)) {
					cnt+=1;
				}
				
				if(')' == line.charAt(offset)) {
					if(cnt<1) break;
					cnt-=1;
				}
				offset+=1;
			}
			
			if(offset==length && cnt==0) System.out.println("YES");
			else System.out.println("NO");
			
			tc-=1;
		}
	}
}
