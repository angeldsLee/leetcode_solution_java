package leetcode;

public class ZigZagConversion {

	public String convert(String s, int numRows) {
        // if(s==null) return null;
        int n = s.length();
        if(n==1 || numRows==1) return s;
        StringBuffer bu = new StringBuffer();
        int indexdif = 2*(numRows-1);//  indexdif = 2*(numRows-1);//首尾两行的下标差
        for(int i=0;i<numRows && indexdif>=0;i++){
            int j = i;
            while(j<n){
                bu.append(s.charAt(j));
                if(indexdif<=0) indexdif = 2*(numRows-1);//到了最后一行
                j = j + indexdif;
                if(indexdif<2*(numRows-1) && j < n){
                    bu.append(s.charAt(j));
                    j = j + (2*(numRows-1) - indexdif);
                }
            }
            indexdif = indexdif - 2;
            
        }
        return bu.toString();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
