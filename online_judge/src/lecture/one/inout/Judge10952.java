package lecture.one.inout;

import java.util.Scanner;

public class Judge10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(true) { //�����̿��� ���� ������ ���� �߻�
		while(sc.hasNextInt()) { //���ڰ� �ƴѰ�� false
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) break;
			
			System.out.println(a+b);
		}
	}
}
