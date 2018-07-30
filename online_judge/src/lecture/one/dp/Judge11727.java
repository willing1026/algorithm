package lecture.one.dp;

import java.util.Scanner;

public class Judge11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dp = new int[1001];
		
		int n = sc.nextInt();
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2 ; i<=n ; i++) {
			dp[i] = (dp[i-1]+dp[i-2]*2)%10007;
		}
		System.out.println(dp[n]);
	}
}
