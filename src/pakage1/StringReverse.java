package pakage1;

public class StringReverse {
	
	public static String reverse(int x){
		String str=Integer.toString(x);
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		StringBuilder sbr=sb.reverse();
		
		return sbr.toString();
	}
	public static String reverse1(String str){
		char[] arr=str.toCharArray();
		int i=0,j=arr.length-1;
		while(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return String.copyValueOf(arr);
		
	}
    
}
