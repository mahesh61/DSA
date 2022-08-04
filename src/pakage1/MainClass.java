package pakage1;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetASCIValues.getASCI('z'));
		
		
		
	
		
		//System.out.println(StringReverse.reverse(12345678));
		//System.out.println(RemoveCharFromString.remove("abnmaadhga", 'a'));
		//System.out.println(PrimeNumbers.getPrimrNo(10));
		
		//System.out.println(ReverseVowelsInString.reverseVowels("hello mahesh"));
         IntegerToArray abc= new IntegerToArray();
		
		String str= "12t5s7";
		int [] array=abc.convertToArray(str);
		
		System.out.println(Arrays.toString(array));
	}

}
