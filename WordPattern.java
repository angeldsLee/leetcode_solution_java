package leetcode;

import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
        int n = pattern.length();
        String string[] = str.split(" ");
        int n1 = string.length;
        if(n1 != n) return false;
        String tmp = "";
        char tmp2 = ' ';
        HashMap<Character, String> hMap = new HashMap<Character,String>();
        HashMap<String,Character> hMap2 = new HashMap<String,Character>();
       
        for(int i=0;i<n;i++){
        	if(hMap.containsKey(pattern.charAt(i))){
        		tmp = hMap.get(pattern.charAt(i));
        		
        		if(!tmp.equals(string[i]) ){
        			return false;
        		}	
        	}
        	if(hMap2.containsKey(string[i])){
        		tmp2 = hMap2.get(string[i]);
        		if(!(tmp2 == pattern.charAt(i))){
        			return false;
        		}
        	}else {
				if(!hMap.containsKey(pattern.charAt(i)))	{
					hMap.put(pattern.charAt(i), string[i]);
				}
				if(!hMap2.containsKey(string[i]))	{
					hMap2.put(string[i], pattern.charAt(i));
				}
			}
        	
        }
        return true;
    }
	public static void main(String args[]){
		WordPattern wPattern = new WordPattern();
//		String patternString = "abba";
//		String str  = "dog cat cat dog";
//		String patternString = "jquery";
//		String str = "jquery";
//		String patternString = "abba";
//		String str = "dog cat cat dog";
		String patternString = "abba";
		String str = "dog dog dog dog";
		System.out.println(wPattern.wordPattern(patternString, str));
	}
}
