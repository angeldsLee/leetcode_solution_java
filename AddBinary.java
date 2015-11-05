package leetcode;

public class AddBinary {

	public String addBinary(String a, String b) {
        StringBuffer my = new StringBuffer();
        int i=a.length()-1,j=b.length()-1;
        int c1=0,c2=0,c=0;
        int cou = 0;
        while(i>=0 && j>=0){
            c1 = a.charAt(i)-'0';
            c2 = b.charAt(j)-'0';
            c = c1 + c2 + cou;
            if(c==3){
               cou = 1;
               my.append(1); 
            } 
            else if(c<2) {
                my.append(c);
                cou = 0;
            }
            else{
                cou = 1;
                my.append(0);
            } 
            i--;
            j--;
        }
        // if(cou==1) my.append(cou);
        
        while(i>=0){
            c = a.charAt(i)-'0'+cou;
            if(c==3){
               cou = 1;
               my.append(1); 
            } 
            else if(c<2){
                my.append(c);
                cou = 0 ;
            }
            else{
               cou = 1;
               my.append(0); 
            }
            i--;
        }
        // if(cou==1) my.append(1);
        
        while(j>=0){
            c = b.charAt(j)-'0'+cou;
            if(c==3){
               cou = 1;
               my.append(1); 
            } 
            else if(c<2){
                my.append(c);
                cou = 0;
            }
            else{
               cou = 1;
               my.append(0); 
            }
            j--;
        }
        if(cou==1) my.append(1);
        
        return  my.reverse().toString();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBinary aBinary = new AddBinary();
		aBinary.addBinary("1111","1111");
	}

}
