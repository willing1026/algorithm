package lecture.one.tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Judge11725 {

	public static void bfs(ArrayList<Integer>[] t, boolean[] c, int[] p, int root, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(Integer iter : t[now]) {
				if(!c[iter]) { //방문한건 부모노드,
					c[iter]=true;
					p[iter]=now;
					q.add(iter);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//bfs 탐색 필요,, 연결리스트?
		
		try {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer>[] t = (ArrayList<Integer>[]) new ArrayList[n+1];
			int[] p = new int[n+1];
			boolean[] c = new boolean[n+1];
			
			for(int i=1 ; i<=n ; i++) {
				t[i] = new ArrayList<Integer>();
			}
			
			//무방향 그래프, 양쪽으로 넣어줘야함
			for(int i=0 ; i<n-1 ; i++) {
				String[] line = br.readLine().split(" ");
				int u = Integer.parseInt(line[0]);
				int v = Integer.parseInt(line[1]);
				t[u].add(v);
				t[v].add(u);
			}
			
			c[1]=true;
			bfs(t, c, p, 1, n);
			
			for(int i=2 ; i<=n ; i++) { //StringBuilder나 bw나 속도 비슷
				bw.write(p[i]+"\n");
			}
			
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
