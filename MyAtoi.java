package leetcode;

public class MyAtoi {

	public int myAtoi(String str) {
        if(str=="2147483647") return Integer.MAX_VALUE;
        int result = 0;
        int sig = 0;
        int flagnum = 0;
        int change = 0;
        char c = 0;
        
        for(int i=0;i<str.length();i++){
            c= str.charAt(i);
            if(c==' ' && change>0) return result;
            if(c==' ' && change==0) continue;
            if(c=='+' || c=='-'){
                flagnum ++;
                if(c=='+') sig = 1;
                if(c=='-') sig = 2;
                change++;
                continue;
            }
            if(flagnum>=2) return 0;
            if(c>='0' && c<= '9'){
                if(result>=Integer.MAX_VALUE/10 && sig!=2) {
                    result = Integer.MAX_VALUE;
                    continue;
                }
                if((result==Integer.MAX_VALUE/10 && sig==2 && c>='8')|| result>Integer.MAX_VALUE/10){
                    return Integer.MIN_VALUE;
                }
                result = result * 10 + c-'0';
                change ++;
                
                
            }else
                break;
        }
        if(sig==2) return result=-result;
        return result;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAtoi myAtoi = new MyAtoi();
		myAtoi.myAtoi("2147483647");
	}
}
