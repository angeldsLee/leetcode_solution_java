package leetcode;

public class AddDigits {

	public int addDigits(int num) {
        int sum = 0;
        int rem = 0;
        while(num>0){
            rem = num % 10;
            if(sum>9){
                sum = sum / 10 + sum % 10;
            }
            sum = sum + rem;
            num = num / 10;
        }
        if(sum>9){
                sum = sum / 10 + sum % 10;
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
