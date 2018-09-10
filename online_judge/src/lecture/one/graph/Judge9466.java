package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public final class Judge9466 {
	
	public static int[] list;
	public static int[] dist;
	public static int[] step;
	
	static int dfs(int x, int cnt, int s) {
		
		if(dist[x] !=0) {
			if(step[x]==s) {
				return cnt-dist[x];
			}
			return 0;
		}
		
		dist[x]=cnt;
		step[x]=s;
		
		return dfs(list[x],cnt+1,s);
	}
	
	public static void main(String[] args) {
		//cycle에 속한 정점수를 합한뒤에 전체에서 뺀다.
		
		//test case
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int tc = Integer.parseInt(br.readLine());
			
			for(int t=0 ; t<tc ; t++) {
				int n = Integer.parseInt(br.readLine());
				
				list = new int[n+1]; 
				dist = new int[n+1];
				step = new int[n+1];
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int i=1 ; i<=n ; i++) {
					list[i]=Integer.parseInt(st.nextToken());
				}
				
				int res=0;
				
				for(int i=1 ; i<=n ; i++) {
					res += dfs(i, 1, i);
				}
				
				bw.write(n-res + "\n");
				bw.flush();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
