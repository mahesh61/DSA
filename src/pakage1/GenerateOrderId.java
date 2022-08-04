package pakage1;

public class GenerateOrderId {
	
	public static String generate(String str) {
		String id="";
		int x = 0,y=0;
		int start=0, end=str.length()-1;
		char[]array=str.toCharArray();
		while(start<=end){
			
		if(start!=end) {
			x= Character.getNumericValue(array[start]);
			y= Character.getNumericValue(array[end]);
			id+=Integer.toString(x+y);	
		  }
		else {
		id+=Integer.toString(Character.getNumericValue(array[start]));	
		}
		start++;
		end--;
		}
		
		return id;
	}

}
