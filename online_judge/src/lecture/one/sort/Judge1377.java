package lecture.one.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pair {
	private int v;
	private int x;
	
	public Pair(int v, int x) {
		this.v = v;
		this.x = x;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class Comp implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		
		int o1V = o1.getV();
		int o2V = o2.getV();
		
		if(o1V < o2V) {
			return -1;
		} else if(o1V > o2V) {
			return 1;
		}
		
		return 0;
	}
}

public class Judge1377 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			List<Pair> list = new ArrayList<Pair>();
			
			for(int i=0 ; i<n ; i++) {
				int v = Integer.parseInt(br.readLine());
				list.add(new Pair(v,i));
			}
			
			Collections.sort(list,new Comp());
			
			int max=0;
			
			for(int i=0 ; i<n ; i++) {
				int bef = list.get(i).getX();

				if(max < bef-i) {
					max = bef-i;
				}
			}
			
			bw.write(Integer.toString(max+1)+"\n");
			bw.flush();
			
		} catch(Exception e) {
			
		}
	}
}
