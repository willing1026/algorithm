package lecture.one.dp;

import java.io.*;

public class Judge2156 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int[] w = new int[n+1];
			int[][] d = new int[n+1][3];
			
			for(int i=1 ; i<n+1 ; i++) w[i] = Integer.parseInt(br.readLine());
			
			d[1][1]=w[1];
			for(int i=2 ; i<=n ; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1] , d[i-1][2]));
				d[i][1] = d[i-1][0] + w[i];
				d[i][2] = d[i-1][1] + w[i];
			}
			
			int res = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			bw.write(Integer.toString(res)+"\n");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
