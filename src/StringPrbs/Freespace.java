package StringPrbs;

public class Freespace {
	
	
	public  static String longestPalin(String S) {
	        if(S.length() < 2){
	            return S;
	        }
	        String max="";
	        for(int i=0; i<S.length()-1; i++){
	            String odd = findPalindrome(S, i, i);
	            String even = findPalindrome(S, i, i+1);
	            if (odd.length() > max.length()) {
	                max = odd;
	            }
	            if (even.length() > max.length()) {
	                max = even;
	            }
	        }
	        return max;    
	    }
	public  static String findPalindrome(String s, int left, int right) {
	        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
	        {
	            left--; right++;
	        }
	        return s.substring(left+1, right);
	    }

}
