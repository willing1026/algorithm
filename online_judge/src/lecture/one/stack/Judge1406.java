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
Scanner, System.out.print, System.out.println �� ��/����� ������ ������ �ſ� �����ϴ�.
���� ���ø�, �Է��� �� 60����, ����� �� 60�����̱� ������ �������� �ſ� ���ٰ� �� �� �ֽ��ϴ�.
BufferdReader, BufferedWriter�� ����غ�����.

�Ʒ� ��ũ���� �ӵ� �񱳸� �� �� ���캸����.
�Է�: https://www.acmicpc.net/blog/view/56
���: https://www.acmicpc.net/blog/view/57
 * 
 */


public class Judge1406 {
	
	//leftStack size > 0
	public static String L = "L"; //�����̵�, left stack -> right stack
	public static String B = "B"; //���ʹ��� ����, left stack pop
	
	//rightStack size > 0
	public static String D = "D"; //�������̵�, right stack -> left stack
	
	public static String P = "P"; //���� ���ʿ� �߰�, left stack push

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String text = null;
		
		try {
			text = br.readLine();
			int len = text.length();
	
			//Ŀ�� ��,�� ���ڿ� ����
			Stack<String> left = new Stack<String>();
			Stack<String> right = new Stack<String>();
			
			//�ʱⰪ setting
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
