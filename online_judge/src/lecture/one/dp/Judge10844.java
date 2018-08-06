package lecture.one.dp;

import java.io.*;

public class Judge10844 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			long[][] d = new long[n+1][10];
			//int범위 초과
			
			for(int j=1 ; j<10 ; j++) d[1][j]=1;
			
			for(int i=2 ; i<=n ; i++) {
				for(int j=0 ; j<10 ; j++) {
					if(j==0) {
						d[i][j] = d[i-1][j+1];
					} else if(j==9) {
						d[i][j] = d[i-1][j-1];
					} else {
						d[i][j]=d[i-1][j-1] + d[i-1][j+1];
					}
					d[i][j]%=1000000000;
				}
			}
			
			long res=0;
			for(int j=0 ; j<10 ; j++) res+=d[n][j];
			bw.write(Long.toString(res%1000000000));
			bw.flush();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bw!=null) {
				try {
					bw.flush();
					bw.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
