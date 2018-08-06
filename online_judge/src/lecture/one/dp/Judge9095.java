package lecture.one.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Judge9095 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int tc = Integer.parseInt(br.readLine());
			int[] d = new int[12];
			d[0]=1;
			d[1]=1;
			d[2]=2;
			
			for(int i=3 ; i<12 ; i++) {
				d[i]=d[i-1]+d[i-2]+d[i-3];
			}

			for(int t=0 ; t<tc ; t++) {
				int n = Integer.parseInt(br.readLine());
				bw.write(Integer.toString(d[n])+"\n");
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try { br.close(); } catch(Exception e) {e.printStackTrace();}
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
