package lecture.one.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Judge10808 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			char[] arr = br.readLine().toCharArray();
			int[] countList = new int[26];
			
			for(char iter : arr) {
				countList[iter-'a'] += 1;
			}
			
			
			for(int idx=0 ; idx<25 ; idx++) {
				bw.write(countList[idx] + " ");
			}
			bw.write(countList[25]+"\n");
			
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
