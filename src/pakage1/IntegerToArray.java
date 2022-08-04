package pakage1;

public class IntegerToArray {
	
	public int[] convertToArray(String str) {
		int count=0;
		
		char[] charArray= str.toCharArray();
		int[] array = new int[charArray.length];
		
		for(char i : charArray) {
			
			int m=Character.getNumericValue(i);
			array[count]=m;
			count++;
		}
		
		
		
		return array;
		
	}

}
