package lecture.one.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Judge11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dp[n] = dp[n-1]+dp[n-2];
		
		int[] dp = new int[1001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			dp[0]=1;
			dp[1]=1;
			
			System.out.println(n);
			bw.write(n);
			
			for(int i=2 ; i<=n ; i++) {
				dp[i] = (dp[i-1] + dp[i-2]) % 10007;
			}
			
			System.out.println(dp[n]);
			bw.write(dp[n]);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try { br.close(); } catch (Exception e) {e.printStackTrace();}
			}
			
			if(bw!=null) {
				try { 
					bw.flush();
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
