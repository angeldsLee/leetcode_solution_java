package leetcode;

public class ConvertToTitle {

	public String convertToTitle(int n) {
		StringBuffer bs = new StringBuffer();
        int rem;
        while(n != 0){
            rem = (n-1)%26;
            bs.append((char)('A'+rem));
            n = (n-1) / 26;
        }
        return bs.reverse().toString();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertToTitle cToTitle = new ConvertToTitle();
		cToTitle.convertToTitle(26);
	}

}
