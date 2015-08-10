package leetcode;

public class IsAnagram {

	public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()) return false;
        int[] ch = new int[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            ch[c]++;
        }
        for(int i=0;i<t.length();i++){
            char h = t.charAt(i);
            if(--ch[h]<0) return false;
        }
        return true;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAnagram iAnagram = new IsAnagram();
		String  a = "a";
		String  b = "b";
		iAnagram.isAnagram(a, b);
	}

}
