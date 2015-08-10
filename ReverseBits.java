package leetcode;

public class ReverseBits {
	
	public int reverseBits(int n) {
        int ans = 0;
        for(int i=1;i<33;i++){
            if ((n & 1)==1) {
            	ans = ans<<1 | 1;
            } else {
            	ans = ans<<1;
            }
            n = n >> 1;
        }
        return ans;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBits rb = new ReverseBits();
		rb.reverseBits(1);
	}

}
