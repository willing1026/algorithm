package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Judge11724 {

	static ArrayList<Integer>[] a;
	static boolean[] c; 
	
	public static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		
		while(!q.isEmpty()) {
			int u = q.poll();
			
			for(int iter : a[u]) {
				if(c[iter]) continue;
				
				c[iter]=true;
				q.add(iter);
			}
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			a = (ArrayList<Integer>[]) new ArrayList[n+1];
			c = new boolean[n+1];
			
			for(int i=1 ; i<=n ; i++) {
				a[i] = new ArrayList<Integer>();
			}
			
			for(int i=0 ; i<m ; i++) {
				StringTokenizer inerSt = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(inerSt.nextToken());
				int v = Integer.parseInt(inerSt.nextToken());
				
				a[u].add(v);
				a[v].add(u);
			}
			
			int cc=0;
			
			for(int i=1 ; i<=n ; i++) {
				if(c[i]) continue;
				
				c[i]=true;
				bfs(i);
				cc+=1;
			}
			
			bw.write(Integer.toString(cc) + "\n");
			bw.flush();
		} catch(Exception e ) {
			
		}
	}
}
