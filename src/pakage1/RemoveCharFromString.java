package pakage1;

public class RemoveCharFromString {

	
	public static String remove(String str ,char c) {
		String newStr="";
		char[] array=str.toCharArray();
		
		for(char i : array){
			
			if(i!=c){
				
				newStr+=i;
			}
		}
		return newStr;
	}
	
}
