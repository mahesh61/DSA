package ggf;

public class PenacString {
	
public static  boolean penacString(String str) {
	String str1=str.toLowerCase();
	int[] arr=new int[26];
	for(int i=0;i<str.length();i++) {
		int index=str1.charAt(i)-97;
		arr[index]++;
	}
	
	for(int i:arr) {
		if(i==0) {
			return false;
		}
	}
	return true;
}
}
