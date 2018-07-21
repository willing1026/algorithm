package lecture.one.stack;

import java.util.Scanner;
import java.util.Stack;

public class Judge10828 {

	public static String PUSH = "push";
	public static String POP = "pop";
	public static String TOP = "top";
	public static String SIZE = "size";
	public static String EMPTY = "empty";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(tc>0) {
			String command = sc.next();
			int param = 0;
			
			if(PUSH.equals(command)) {
				stack.push(sc.nextInt());
				
			} else if(SIZE.equals(command)) {
				System.out.println(stack.size());
			} else {
				boolean isEmpty = stack.isEmpty();
				
				if(isEmpty) {
					param = 1; //empty
					if(POP.equals(command) || TOP.equals(command)) param=-1;
					
				} else {
					param=0; //empty
					if(POP.equals(command)) param = stack.pop();
					else if(TOP.equals(command)) param = stack.peek();
				}
				System.out.println(param);
			}
			tc-=1;
		}
	}
}
