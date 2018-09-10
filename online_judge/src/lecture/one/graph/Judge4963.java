package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//class Pair {
//	int x;
//	int y;
//	
//	public Pair(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
//}


public class Judge4963 {
	
	public static void bfs(int[][] island, boolean[][] check, int w, int h, int x, int y) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x,y));
		
		int[] ax= {-1,1,0,0,-1,-1,1,1};
		int[] ay= {0,0,-1,1,-1,1,-1,1};
		
		while(q.isEmpty()==false) {
			Pair p = q.poll();
			
			for(int i=0 ; i<8 ; i++) {
				int nx = p.x + ax[i];
				int ny = p.y + ay[i];
				
				if(nx>=0 && nx<h && ny>=0 && ny<w) {
					//섬 판단 & 방문여부
					if(island[nx][ny]==1 && check[nx][ny]==false) {
						check[nx][ny]=true;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int w = Integer.parseInt(st.nextToken());
				int h = Integer.parseInt(st.nextToken());
				
				if(w==0 && h==0) break; //종료
				
				int[][] island = new int[h][w];
				boolean[][] check = new boolean[h][w];
				
				for(int i=0 ; i<h ; i++) {
					String[] temp = br.readLine().split(" ");
					for(int j=0 ; j<w ; j++) {
						island[i][j] = Integer.parseInt(temp[j]);
					}
				}
				
				int res=0;
				
				for(int x=0 ; x<h ; x++) {
					for(int y=0 ; y<w ; y++) {
						if(island[x][y]==1 && check[x][y]==false) {
							check[x][y]=true;
							bfs(island,check,w,h,x,y);
							res+=1;
						}
					}
				}
				
				bw.write(res+"\n");
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
