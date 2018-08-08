package lecture.one.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Judge11722 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n+1];
			int[] d = new int[n+1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=1 ; i<=n ; i++) {
				a[i] = Integer.parseInt(st.nextToken()); 
			}
			
			int res=0;
			
			for(int i=1 ; i<=n ; i++) {
				
				d[i]=1;
				
				for(int j=1 ; j<i ; j++) {
				
					if(a[j] > a[i] && d[j]+1 > d[i]) {
						d[i]=d[j]+1;
					}
					
				}
				
				if(res < d[i]) {
					res=d[i];
				}
			}
			
			bw.write(Integer.toString(res)+"\n");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
