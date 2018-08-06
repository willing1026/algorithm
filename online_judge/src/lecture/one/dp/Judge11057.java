package lecture.one.dp;

import java.io.*;

public class Judge11057 {

	public static void main(String[] args) {
//		D[i][j] = sum(D[i-1][0 ~ j]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int[][] d = new int[n+1][10];
			
			for(int j=0 ; j<10 ; j++) {
				d[1][j]=1;
			}
			
			for(int i=2 ; i<=n ; i++) {
				for(int j=0 ; j<10 ; j++) {
					for(int k=0 ; k<=j ; k++) {
						d[i][j]+=d[i-1][k];
						d[i][j]%=10007;
					}
				}
			}
			
			int res=0;
			for(int j=0 ; j<10 ; j++) {
				res+=d[n][j];
				res%=10007;
			}
			
			bw.write(Integer.toString(res));
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
