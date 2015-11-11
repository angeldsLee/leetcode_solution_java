package leetcode;

import java.util.HashMap;
/**
 * Created by angelds on 2015/11/11.
 */
public class SingleNumber3 {

    public static void singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
//        int res[] = new int[2];
        int cou = 1;
        for (int a:nums) {
            if(hm.containsKey(a)){
                cou = hm.get(a);
                cou++;
                hm.remove(a);
            }else {
                hm.put(a, cou);
            }
        }
        for (int b:hm.keySet()) {
            System.out.println(b);
        }

    }
    public static void main(String args[]){
        int nums[] = {1,2,1,3,2,5};
        singleNumber(nums);
    }


}
