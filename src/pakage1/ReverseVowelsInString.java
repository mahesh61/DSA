package pakage1;

public class ReverseVowelsInString {
	
	
	static boolean isVowel(char c) {
		return (c=='a'||c=='A'||c=='E'||c=='e'||c=='I'||c=='i'||c=='o'||c=='O'||c=='U'||c=='u');
	}
	
	static String reverseVowels(String str) {
		
		int i=0,j=str.length()-1;
		char[] arr= str.toCharArray();
		
		while(i<j) {
			
			if(!isVowel(arr[i])) {
				i++;
				continue;
			}
			
			if(!isVowel(arr[j])) {
			j--;
			continue;
			}
			
			//Swaping
		char x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
		
		i++;
		j--;
		}
			
		return String.copyValueOf(arr);
	}

}
