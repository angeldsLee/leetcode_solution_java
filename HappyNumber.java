package leetcode;

import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        int sum = getNum(n);
        while(!set.contains(sum)){
            set.add(sum);
         
            sum = getNum(sum);
            if(sum==1) return true;
        }
        return false;//set 思想很重要
    }
    
    public int getNum(int n){
        int[] array = new int[11];
        int index = 0;
        while(n>0){
            array[index] = n % 10;
            n = n / 10;
            index++;
        }
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i]*array[i];
        }
        return sum;
    }
    
    public static void main(String args[]) {
    	HappyNumber hm = new HappyNumber();
    	boolean result = hm.isHappy(7);
    }
}