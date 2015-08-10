package leetcode;

public class HammingWeight {

	public int hammingWeight(int n) {
        int count = 0;
        for(int i=1;i<33;i++){
            if((n & 1)==1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
	
	public int hammingWeight2(int n) {
		if(n==0) return 0;
        int count = 0;
        while(n!=0){
        	count++;
        	n = n & (n-1);
        	
        }
        return count;
    }
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HammingWeight hWeight = new HammingWeight();
		hWeight.hammingWeight(12);
	}

}
