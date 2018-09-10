package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Judge10451 {
	
	public static ArrayList<Integer>[] a;
	public static boolean[] c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int tc;			
			tc = Integer.parseInt(br.readLine());
			
			for(int t=0 ; t<tc ; t++) {
				int n = Integer.parseInt(br.readLine());
				a = (ArrayList<Integer>[]) new ArrayList[n+1];
				c = new boolean[n+1];
				
				for(int i=1 ; i<=n ; i++) {
					a[i] = new ArrayList<Integer>();
				}
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int i=1 ; i<=n ; i++) {
					a[i].add(Integer.parseInt(st.nextToken()));
				}
				
				int cycleCnt=0;
				for(int i=1 ; i<=n ; i++) {
					if(c[i]==false) {
						cycleCnt+=1;
						c[i]=true;
						bfs(i);
					}
				}
				
				bw.write(cycleCnt+"\n");
//				bw.write(Integer.toString(cycleCnt)+"\n");
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		
		while(!q.isEmpty()) {
			int v = q.poll();
			
			for(int iter : a[v]) {
				if(c[iter]==false) {
					c[iter]=true;
					q.add(iter);
				}
			}
		}
	}
}
