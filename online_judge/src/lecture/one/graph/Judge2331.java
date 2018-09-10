package lecture.one.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Judge2331 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
			m.put(n, 1);
			
			int res=0;
			int cnt=1;
			while(true) {
				
				int tmp = n;
				n=0;
				while(tmp>0) {
					n += (int) Math.pow(tmp%10,p);
					tmp/=10;
				}
				
				if(m.get(n)!=null) {
					res = m.get(n)-1;
					break;
				}
				m.put(n,++cnt);
			}
			
			bw.write(res+"\n");
			bw.flush();
			
		} catch(Exception e ) {
			
		}
	}

}
