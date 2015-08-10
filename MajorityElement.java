package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maj = 0;
        int tmp = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                tmp = map.get(nums[i]) + 1;
                if (tmp> n/2) {
                    maj = nums[i];
                }
                map.put(nums[i],tmp);
            }else{
                map.put(nums[i],1);
                }
        }
        return maj;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement mElement = new MajorityElement();
		int[] m = {6,6,6,7,7};
		mElement.majorityElement(m);
	}

}
