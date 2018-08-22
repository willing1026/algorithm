package lecture.one.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Judge1212 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] octal = {"000","001","010","011","100","101","110","111"};
		
		try {
			char[] arr = br.readLine().toCharArray();
			boolean start=true;
			
			if (arr.length==1 && arr[0]=='0') {
				bw.write("0");
			}
			
			for(char iter : arr) {
				int n = iter - '0';
				
				if (start && n < 4) {
					if(n==0) continue;
					else if(n==1) {
						bw.write("1");
					} else if (n==2) {
						bw.write("10");
					} else if (n==3) {
						bw.write("11");
					}
					start=false;
				} else {
					bw.write(octal[n]);
					start=false;
				}
			}
			bw.newLine();
			bw.flush();
			
		} catch(Exception e) {
			
		}
	}
}
