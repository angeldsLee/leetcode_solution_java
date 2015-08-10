package leetcode;

public class RomanToInteger {

	public int romanToInt(String s) {
        int res = toInt(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(toInt(s.charAt(i-1))<toInt(s.charAt(i))) res = res + toInt(s.charAt(i)) - 2*toInt(s.charAt(i-1));
            else res = res + toInt(s.charAt(i));
        }
        return res;
    }
    public int toInt(char s){
         switch (s) {  
            case 'I': return 1;  
            case 'V': return 5;  
            case 'X': return 10;  
            case 'L': return 50;  
            case 'C': return 100;  
            case 'D': return 500;  
            case 'M': return 1000;  
        }  
        return 0;  
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
