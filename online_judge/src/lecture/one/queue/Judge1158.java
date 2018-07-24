package lecture.one.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Judge1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			Queue<Integer> queue = new LinkedList<Integer>();
			
			//make circle
			for(int idx=1 ; idx<=n ; idx++) {
				queue.add(idx);
			}
			
			bw.write("<");
			for(;queue.size()>1;) {
				for(int idx=1 ; idx<m ; idx++) {
					queue.add(queue.poll());
				}
				bw.write(queue.poll() + ", ");
			}
			
			bw.write(queue.poll() + ">");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bw != null) {
				try {
					bw.flush();
					bw.close(); 
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
