package lecture.one.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Judge11650 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.valueOf(br.readLine());
			List<Point> list = new ArrayList<Point>();
			
			for(int i=0 ; i<n ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				list.add(new Point(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken())));
			}
			
			Collections.sort(list , new objComp());
			
			for(Point iter : list) {
				bw.write(iter.x + " " + iter.y + "\n");
				bw.flush();
			}
			
		} catch(Exception e) {
			
		}
	}
}

//class Point {
//	int x;
//	int y;
//	
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class objComp implements Comparator<Point> {
//
//	@Override
//	public int compare(Point p1, Point p2) {
//
//		if(p1.x > p2.x) {
//			return 1;
//		} else if(p1.x < p2.x) {
//			return -1;
//		} else if(p1.y > p2.y) {
//			return 1;
//		} else if(p1.y < p2.y) {
//			return -1;
//		}
//		
//		return 0;
//	}
//	
//}