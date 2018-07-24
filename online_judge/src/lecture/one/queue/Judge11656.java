package lecture.one.queue;

/**
 * Collections 이용한 list 정렬방법
 * http://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Judge11656 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		List<String> list = new ArrayList<String>();
		
		int len = text.length();
		
		list.add(text);
		for(int idx=1 ; idx<len ; idx++) {
			list.add(text.substring(idx));
		}
		
		Collections.sort(list);
		
		for(String iter : list) {
			System.out.println(iter);
		}
	}
}
