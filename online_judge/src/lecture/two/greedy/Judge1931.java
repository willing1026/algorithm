package lecture.two.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Schedule {
	int s;
	int e;
	
	Schedule(int s, int e) {
		this.s = s;
		this.e = e;
	}
}

class MyComp implements Comparator<Schedule> {

	@Override
	public int compare(Schedule a, Schedule b) {
		
		//시작시간도 정렬해야함
		// 1,1 / 2,2 / 1,2 -> 정답이 3인데, 종료시간만 정렬할경우 2가 나올수도 있다.
		
		if(a.e > b.e) {
			return 1;
		} else if (a.e < b.e) {
			return -1;
		} else {
			if(a.s > b.s) {
				return 1;
			}else if (a.s < b.s) {
				return -1;
			}
		}
		
		return 0;
	}
}

public class Judge1931 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			List<Schedule> list = new ArrayList<Schedule>();
			
			for(int i=0 ; i<n ; i++) {
				String[] line = br.readLine().split(" ");
				int s = Integer.parseInt(line[0]);
				int e = Integer.parseInt(line[1]);
				
				list.add(new Schedule(s,e));
			}
			
			Collections.sort(list , new MyComp());

			int res=0;
			int end=0;
			
			for(int i=0 ; i<n ; i++) {
				if(end <= list.get(i).s) {
					res+=1;
					end = list.get(i).e;
				}
			}
			
			System.out.println(res);
			
		}catch (Exception e) {
			
		}
	}

}
