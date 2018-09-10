package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//class Pair {
//	int x;
//	int y;
//	
//	public Pair(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class Judge2667 {

	static int[][] house;//배열
	static boolean[][] check;//방문여부 배열
	static ArrayList<Integer> count;//개수저장 list
	
	public static void bfs(int x, int y, int size) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x,y));
		
		int[] addX = {-1,1,0,0};
		int[] addY = {0,0,-1,1};
		
		int cnt=1;
		while(q.isEmpty()==false) {
			Pair p = q.poll();
			
			for(int i=0 ; i<4 ; i++) {
				int nx = p.x + addX[i];
				int ny = p.y + addY[i];
				
				//범위확인
				if(nx>= 0 && nx<size && ny>=0 && ny<size) {
					//1인지 확인 + 방문여부
					if(house[nx][ny]==1 && check[nx][ny]==false) {
						cnt+=1;
						check[nx][ny]=true;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
		count.add(cnt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상,하,좌,우 bfs 탐색
			//배열범위 벗어나지 않는지 검사 필요
			//배열범위 안+방문안한곳 -> 탐색
			//탐색할때 cnt도 세면서 진행. -> int[] 에 저장. 마지막에 오름차순 정렬
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			house = new int[n][n];
			check = new boolean[n][n];
			count = new ArrayList<Integer>();
			
			for(int i=0 ; i<n ; i++) {
				String  line = br.readLine();
				for(int j=0 ; j<n ; j++) {
					house[i][j] = line.charAt(j)-'0';
				}
			}
			
			for(int i=0 ; i<n ; i++) {
				for(int j=0 ; j<n ; j++) {
					if(house[i][j]==1 && check[i][j]==false) {
						check[i][j]=true;
						bfs(i,j, n);
					}
				}
			}
			
			bw.write(count.size() + "\n");
			
			if(count.size()>0) {
				Collections.sort(count);
				
				for(int iter : count) {
					bw.write(iter+"\n");
				}
			}
			
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
