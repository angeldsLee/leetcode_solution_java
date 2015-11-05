package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {

	public String countAndSay(int n) {
        if(n<1) return null;
        List<String> ls = new ArrayList<String>();
        StringBuffer my1 = new StringBuffer();
        my1.append(1);
        ls.add(my1.toString());
        if(n==1) return ls.get(0);
        int i = 1;
        int k = 0;
        int count = 0;
        while(i<n){
            StringBuffer my = new StringBuffer();;
            String s = ls.get(i-1);
            for(int j=0;j<s.length();){
                k=j+1;
                count = 1;
                while(k<s.length() && s.charAt(j)==s.charAt(k)){
                    k++;
                    count++;
                }
                my.append(count);
                my.append(s.charAt(k-1));
                j=k;
                // if(j==s.length() && j>1) {       			
                // 	my.append(count);
                //     my.append(s.charAt(j-1));
                //     break;
                // }
            }
            ls.add(my.toString());
            i++;
        }
        return ls.get(n-1);
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountandSay cSay = new CountandSay();
		cSay.countAndSay(4);
	}

}
