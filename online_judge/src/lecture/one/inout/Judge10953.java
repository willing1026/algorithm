package lecture.one.inout;

import java.util.Scanner;

public class Judge10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine(); //enteró��
		
		for(int t=0 ; t<tc ; t++) {

//ù��° ���
//			String[] line = sc.nextLine().split(",");
//			int a = Integer.parseInt(line[0]);
//			int b = Integer.parseInt(line[1]);
			
//			�ι�°���
			String line = sc.nextLine();
			int a = line.charAt(0)-'0';
			int b = line.charAt(2)-'0';

			System.out.println(a+b);
		}
	}
}
