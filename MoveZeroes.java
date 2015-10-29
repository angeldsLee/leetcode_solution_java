public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0,j = 0;// as zero is all the same,just move non-zeros ahead
        int count = 0; // number of non-zeros
        while(i<n){
            if(nums[i]==0){
                j = i + 1;
                if(j==n) break;
                while(nums[j]==0){
                    j++;
                    if(j==n) break;
                }
                if(j==n) break;
                nums[i] = nums[j];
                nums[j] = 0;
                count++;
                i++;
                if(j == n){
                    break;     
                }
                
            }else {
				i++;
			}        
        }
    }
}