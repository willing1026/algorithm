package lecture.one.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Judge1991 {

	public static void preOrder(char[][] tree, char val) {
		if(val=='.') return;
		
		System.out.print(val);
		preOrder(tree,tree[val-'A'][0]);
		preOrder(tree,tree[val-'A'][1]);
	}
	
	public static void inOrder(char[][] tree, char val) {
		if(val=='.') return;
		
		inOrder(tree, tree[val-'A'][0]);
		System.out.print(val);
		inOrder(tree,tree[val-'A'][1]);
	}
	
	public static void postOrder(char[][] tree, char val) {
		if(val=='.') return;
		postOrder(tree,tree[val-'A'][0]);
		postOrder(tree,tree[val-'A'][1]);
		System.out.print(val);
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			char[][] tree = new char[26][2]; //0-25
			
			for(int i=0 ; i<n ; i++) {
				String line = br.readLine();
				int idx = line.charAt(0)-'A';
				tree[idx][0] = line.charAt(2);
				tree[idx][1] = line.charAt(4);
			}
			
			preOrder(tree, 'A');
			System.out.println();
			inOrder(tree, 'A');
			System.out.println();
			postOrder(tree, 'A');
			System.out.println();
			
		} catch(Exception e) {
			
		}
	}

}
