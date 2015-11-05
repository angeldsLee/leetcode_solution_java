package leetcode;

import java.util.*;
import java.io.*;

public class Indeed1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int len = string.length();
		StringBuffer resString = new StringBuffer();
		char t;
		for(int i=0;i<len;i++){
			t = string.charAt(i);
			resString.append(t);
			resString.append(t);
		}
		
		System.out.println(resString.toString());

	}

}
