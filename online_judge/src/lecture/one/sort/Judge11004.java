package lecture.one.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Judge11004 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			StringTokenizer val = new StringTokenizer(br.readLine());
			
			for(int i=0 ; i<n ; i++) {
				arr[i] = Integer.parseInt(val.nextToken());
			}
			
			Arrays.sort(arr);
			
			bw.write(arr[k-1]+"\n");
			bw.flush();
			
		} catch(Exception e) {
			
		}
	}
}
