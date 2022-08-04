package StringPrbs;

import java.util.HashMap;
import java.util.*;

public class StringPractice {
	public static void printDupInStr(String str) {
		Map<Character, Integer> box = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (box.containsKey(str.charAt(i))) {
				box.put(str.charAt(i), box.get(str.charAt(i)) + 1);
			} else {
				box.put(str.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> item : box.entrySet()) {
			if (item.getValue() > 1) {
				System.out.println(item.getKey() + "count=" + item.getValue());
			}
		}
	}
	/*
	 * public static boolean areRotation(String s1, String s2) {
	 * if(s1.length()!=s2.length()) { return false; } Queue <Character> q1= new
	 * LinkedList<Character>(); for(int i=0;i<s1.length();i++) {
	 * q1.add(s1.charAt(i)); } Queue <Character> q2=new LinkedList<Character>();
	 * for(int i=0;i<s2.length();i++) { q2.add(s2.charAt(i)); } int k =s2.length();
	 * while(k>0){ k--; char c=q2.peek(); q2.remove(); q2.add(c); if(q2.equals(q1))
	 * { return true; }
	 * 
	 * }
	 * 
	 * return false; }
	 * 
	 * public static boolean isShuffledStrOf(String s1, String s2,String result){
	 * if(checkLength(s1,s2,result)) { String first=sortedString(s1); String
	 * second=sortedString(s2); String res=sortedString(result); int i=0,j=0,k=0;
	 * while(k!=res.length()) { if(i<first.length()&&first.charAt(i)==res.charAt(k))
	 * { i++; } else if(j<second.length()&&second.charAt(j)==res.charAt(k)) { j++; }
	 * }
	 * 
	 * 
	 * }else { return false;} }
	 */
	private static boolean checkLength(String s1, String s2, String result) {
		if (s1.length() + s2.length() == result.length()) {
			return true;
		} else {
			return false;
		}
	}
	private static String sortedString(String s1) {

		char[] ca = s1.toCharArray();
		Arrays.sort(ca);

		return String.valueOf(ca);
	}
	public static String sayAndCount(int n){
		
		if(n==1) 
		{
			return "1";
		}		
	    String res=	sayAndCount(n-1);
	    StringBuilder sb= new StringBuilder();
	    int freq=0;
		for(int i=0;i<res.length();i++)
		{
			 freq++;
			 if(i==res.length()-1||res.charAt(i)!=res.charAt(i+1))
			 {
				 sb.append(freq).append(res.charAt(i));
				 freq=0;
			 }
			
		 }
     	
		return sb.toString();
	}
    public static void permutation(char[] str,int current) {
	if(current==str.length-1) {
		System.out.println(String.valueOf(str));
	}
	for(int i=current;i<str.length ;i++) {
		swap(str,current,i);
		permutation(str,current+1);
		swap(str,current,i);
	}
	
}
    public static void findPermutations(String str) {
	 
    // base case
    if (str == null || str.length() == 0) {
        return;
    }

    permutation(str.toCharArray(), 0);
}
    public static void swap(char[] str,int i,int j){
	char t=str[i];
	str[i]=str[j];
	str[j]=t;
}
    public static boolean isPolindrome(String str,int l,int r) {
    	if(l==r) {
    		return true;
    		}
    	if(str.charAt(l)!=str.charAt(r)) {
    		return false;
    	}
    	
    	return isPolindrome(str,l+1,r-1);
    }
    static String removeSpaceSpe(char[] arr) {
    	String res="";
    	for(int x=0;x<arr.length;x++) {
    		char c=arr[x];
    		if(Character.isLetterOrDigit(c)) {
    			res+=c;
    		}
    	}
    	return res.toLowerCase();
    }
    public static String stringReverse(char[] arr1) {
        // Write your code here.
    	String s=removeSpaceSpe(arr1);
    	char[] arr=s.toCharArray();
           int i=0,j=arr.length-1;
          while(i<=j){
              char t= arr[i];
              arr[i]=arr[j];
              arr[j]=t;
               i++;
              j--;
          }
          return String.valueOf(arr);
      }
}
