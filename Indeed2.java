package leetcode;

import java.util.*;
import java.io.*;

public class Indeed2 {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean flag = false;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int tmp,num = 1;
		for(int i=0;i<n;i++){
			tmp = scanner.nextInt();
			if(map.containsKey(tmp)){
				num = map.get(tmp);
				num ++;
				if(num > n/2){
					flag = true;
					System.out.println(tmp);
					break;
				}
				map.put(tmp, num);
				num = 1;
			}else{
				map.put(tmp, num);
			}
			
		}
		if(!flag) {
			System.out.println("?");
		}
	}

}
