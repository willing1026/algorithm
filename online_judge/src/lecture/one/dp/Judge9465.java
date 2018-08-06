package lecture.one.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Judge9465 {

	public static void main(String[] args) {
		//스티커를 떼는경우, 안떼는 경우
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int tc = Integer.parseInt(br.readLine());
			
			for(int t=0 ; t<tc ; t++) {
				int n = Integer.parseInt(br.readLine());
				int[][] s = new int[n+1][2];
				int[][] d = new int[n+1][3];
				
				for(int j=0 ; j<2 ; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					
					for(int i=1 ; i<=n ; i++) {
						s[i][j] = Integer.parseInt(st.nextToken());
					}
				}
				
				for(int i=1 ; i<=n ; i++) {
					
					d[i][0] = Math.max(d[i-1][0], d[i-1][1]);
					d[i][0] = Math.max(d[i][0], d[i-1][2]);
					
					d[i][1] = Math.max(d[i-1][0], d[i-1][2])+s[i][0];
					
					d[i][2] = Math.max(d[i-1][0], d[i-1][1])+s[i][1];
				}
				
				int maxVal = Math.max(d[n][0], d[n][1]);
				maxVal = Math.max(maxVal, d[n][2]);
				
				bw.write(Integer.toString(maxVal)+"\n");
				bw.flush();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
