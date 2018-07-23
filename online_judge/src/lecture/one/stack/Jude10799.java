package lecture.one.stack;

import java.util.*;

public class Jude10799 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int res = 0;
	
//case1
//		String stick = sc.nextLine();
//		int length = stick.length();
//		
//		for(int idx=0 ; idx<length ; idx++) {
//			char ps = stick.charAt(idx);
//			
//			if('(' == ps) {
//				stack.push(idx);
//				continue;
//			}
//			
//			if(stack.size()==0) break;
//			
//			if(stack.pop() == idx-1) {
//				res+=stack.size();
//			}else { //막대기가 끝나는 부분. +1
//				res+=1;
//			}
//		}
//		System.out.println(res);

//case2 - 속도차이는 크게 없음
		char[] stick = sc.nextLine().toCharArray();
		int len = stick.length;
		
		for(int idx=0 ; idx<len ; idx++) {
			if('(' == stick[idx]) {
				stack.push(idx);
				continue;
			}
			
			if(stack.size()==0) {
				break;
			}
			
			if(stack.pop() == idx-1) res += stack.size();
			else res += 1;
		}
		System.out.println(res);
	}
}
