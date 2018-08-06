package lecture.one.dp;

import java.io.*;
public class Judge2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		D[n][1]=D[n-1][0]
//		D[n][0]=D[n-1][0]+D[n-1][1];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			long[][] d = new long[n+1][2];
			
			d[1][1]=1;
			
			for(int i=2 ; i<=n ; i++) {
				d[i][0]=d[i-1][0]+d[i-1][1];
				d[i][1]=d[i-1][0];
			}
			bw.write(Long.toString(d[n][0]+d[n][1]));
			bw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}