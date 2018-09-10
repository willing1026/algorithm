package lecture.one.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int x;
	int y;
	
	public Pair(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class Judge2178 {

	public static void bfs(int[][] maze, boolean[][] check, int[][] dist, int n, int m) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(1,1));
		
		int[] ax = {-1,1,0,0};
		int[] ay = {0,0,-1,1}; 
		dist[1][1]=1;
		
		
		while(q.isEmpty()==false) {
			Pair p = q.poll();
			
			if(p.x==n && p.y==m) {
				System.out.println(dist[n][m]);
				break;
			}
			
			for(int i=0 ; i<4 ; i++) {
				int nx = p.x + ax[i];
				int ny = p.y + ay[i];
				
				if(nx>0 && nx<=n && ny>0 && ny<=m) {
					if(maze[nx][ny]==1 && check[nx][ny]==false) {
						check[nx][ny]=true;
						dist[nx][ny]=dist[p.x][p.y]+1;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] size = br.readLine().split(" ");
			int n = Integer.parseInt(size[0]);
			int m = Integer.parseInt(size[1]);
			
			int[][] maze = new int[n+1][m+1];
			int[][] dist = new int[n+1][m+1];
			boolean[][] check = new boolean[n+1][m+1];
			
			for(int i=1 ; i<=n ; i++) {
				char[] temp = br.readLine().toCharArray();
				for(int j=1 ; j<=m ; j++) {
					maze[i][j]=temp[j-1]-'0';
				}
			}
			
			check[1][1]=true;
			bfs(maze, check, dist,n,m);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
