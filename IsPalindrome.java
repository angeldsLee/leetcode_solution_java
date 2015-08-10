package leetcode;

public class IsPalindrome {

	public boolean isPalindrome(String s) {
        if(s==null || s.length()==1) return true;
        int n = s.length();
        s = s.toLowerCase();
        int l=0,r=0;
        int i=0,j=n-1;
        while(i<j){
            l = s.charAt(i);
            r = s.charAt(j);
            if((l <'a' || l > 'z') && (l<'0' || l >'9')) {
                i++;
                l = s.charAt(i);
                continue;
                // if(i>j) break;
            }
            if((r <'a' || r > 'z') && (r<'0' || r >'9')){
                j--;
                r = s.charAt(j);
                continue;
                // if(j<i) break;
            } 
            if(l!=r) return false;
            i++;
            j--;
        }
        
        return true;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPalindrome iPalindrome = new IsPalindrome();
		iPalindrome.isPalindrome("......a.....");
	}

}
