public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        java.util.Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]!=i) return i;
        }
        return len;
    }
}