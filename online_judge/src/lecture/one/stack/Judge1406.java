package lecture.one.stack;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
Scanner, System.out.print, System.out.println 은 입/출력의 개수가 많으면 매우 느립니다.
문제 보시면, 입력이 약 60만개, 출력이 약 60만개이기 때문에 이정도면 매우 많다고 볼 수 있습니다.
BufferdReader, BufferedWriter를 사용해보세요.

아래 링크에서 속도 비교를 좀 더 살펴보세요.
입력: https://www.acmicpc.net/blog/view/56
출력: https://www.acmicpc.net/blog/view/57
 * 
 */


public class Judge1406 {
	
	//leftStack size > 0
	public static String L = "L"; //왼쪽이동, left stack -> right stack
	public static String B = "B"; //왼쪽문자 삭제, left stack pop
	
	//rightStack size > 0
	public static String D = "D"; //오른쪽이동, right stack -> left stack
	
	public static String P = "P"; //문자 왼쪽에 추가, left stack push

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String text = null;
		
		try {
			text = br.readLine();
			int len = text.length();
	
			//커서 좌,우 문자열 스택
			Stack<String> left = new Stack<String>();
			Stack<String> right = new Stack<String>();
			
			//초기값 setting
			for(int idx=0 ; idx<len ; idx++) {
				left.push(text.substring(idx, idx+1));
			}
			
			int cnt = Integer.parseInt(br.readLine());
			
			for(int idx=0 ; idx<cnt ; idx++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String cmd = st.nextToken();
				
				
				char oper = cmd.charAt(0);
				
				int leftSize = left.size();
				int rightSize = right.size();
				
				if("L".equals(cmd) && leftSize>0) {
					
					right.push(left.pop()); //O(1)
					
				} else if ("B".equals(cmd) && leftSize>0) {
					
					left.pop(); //O(1)
					
				} else if ("D".equals(cmd) && rightSize>0) {
					
					left.push(right.pop()); //O(1)
					
				} else if ("P".equals(cmd)) {
					
					left.push(st.nextToken()); //O(1)
					
				}
			}
			
			for(String iter : left) bw.write(iter);
			for(;!right.isEmpty();) bw.write(right.pop());
			bw.flush();
			bw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) { 
				try { br.close(); } catch(Exception e) { e.printStackTrace(); }
			}
			
			if(bw != null) {
				try { bw.close(); } catch(Exception e) { e.printStackTrace(); }
			}
		}
	}
}
