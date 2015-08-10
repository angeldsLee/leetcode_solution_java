package leetcode;

public class TitleToNumber {

	public int titleToNumber(String s) {
        int sum = 0;
        int c = 0;
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i)-'A'+1;
            sum = sum * 26 + c;
        }
        return sum;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
