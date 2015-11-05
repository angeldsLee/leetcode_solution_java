package leetcode;

import java.io.*;
import java.util.*;

public class Indeed3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean flag = false;
		
		int a[] = new int[n];
		int b[] = new int[m];
		int tmp;
		for(int i=0;i<n;i++){
			tmp = scanner.nextInt();
			a[i] = tmp;
		}
		for(int j=0;j<m;j++){
			tmp = scanner.nextInt();
			b[j] = tmp;
		}
		if(n < m) {
			System.out.println("NO");
			flag = true;
		}
		java.util.Arrays.sort(a);
		java.util.Arrays.sort(b);
		if(!flag){
			for(int i=0;i<m;i++){
				if(a[n-1-i] < b[m-1-i]){
					if(!flag) {
						System.out.println("NO");
						flag = true;
						break;
					}
				}
			}
			if(!flag) {
				System.out.println("YES");
			}
		}
	}

}
