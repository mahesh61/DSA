package pakage1;

public class GetASCIValues {
	
	
	
	static String capstoSmallviceVersa(String str) {
	int 	length = str.length();
	int i=0; 
	char c='a';
	String s="";
		while(i<=length-1) {
			if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
			   c = (char) (str.charAt(i) + 32);
			
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
				 c = (char) (str.charAt(i)-32);
			}
			s+=c;
			i++;
		}
		
		return s;
	}
	
	public static int getASCI(char c) {
		int asci= (int)c;
		
		return asci;
	}

}
