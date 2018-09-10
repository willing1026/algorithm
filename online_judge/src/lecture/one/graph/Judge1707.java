package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Judge1707 {

	public static ArrayList<Integer>[] a;
	public static int[] c;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int tc = Integer.parseInt(br.readLine());
			
			for(int t=0 ; t<tc ; t++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(st1.nextToken());
				int e = Integer.parseInt(st1.nextToken());
				boolean isBiGraph=true;
				
				a = (ArrayList<Integer>[]) new ArrayList[v+1];
				for(int i=1 ; i<=v ; i++) {
					a[i] = new ArrayList<Integer>();
				}
				
				c = new int[v+1];
				
				for(int i=0 ; i<e ; i++) {
					StringTokenizer st2 = new StringTokenizer(br.readLine());
					int vertex1 = Integer.parseInt(st2.nextToken());
					int vertex2 = Integer.parseInt(st2.nextToken());
					
					a[vertex1].add(vertex2);
					a[vertex2].add(vertex1);
				}
				
				for(int i=1 ; i<=v && isBiGraph ; i++) {
					
					if(c[i]!=0) continue;
					
					c[i]=1;
					isBiGraph = bfs(i);
				}
				
				if(isBiGraph) {
					bw.write("YES\n");
				}else {
					bw.write("NO\n");
				}
				bw.flush();
			}
		} catch(Exception e) {
			
		}
	}
	
	public static boolean bfs(int x) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		
		while(!q.isEmpty()) {
			int v = q.poll();
			
			for(int iter : a[v]) {
				if(c[v]==c[iter]) {
					return false;
				}
				
				if(c[iter] != 0) continue;
				
				c[iter] = 3-c[v]; // 1 or 2
				q.add(iter);
				
			}
		}
		return true;
	}
}
