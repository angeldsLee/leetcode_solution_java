package leetcode;

import java.io.*;
import java.util.*;

//求N个数的和为特定值X

public class Baidu1 {
	
	public static int Multimy(int num){
		int mul = 1;
		if(num==0) return 1;
		for(int i=1;i<=num;i++)
			mul *= i;
		return mul;
	}

	public static int computeCnm(int n,int m){
		if (m==0) return 1;
		int sum = 1;
		sum = Multimy(n) / Multimy(m) / Multimy(n-m);
		return sum;
	}
	
	public static void computePro(int n,int sma,int big,int x,int count){
		
		if(sma>big) return;
	    computePro(n, ++sma, big, x,count);
	    computePro(n, sma, big--, x,count);
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sma = scanner.nextInt();
		int big = scanner.nextInt();
		int x = scanner.nextInt();
		float pro = 0.0f;
		tot = computeCnm(big-sma+1,n);
		int count = 0;
//		pro = computePro(n,sma,big,x) / tot;
		System.out.println(String.format("%.4f",pro));
	}

}
