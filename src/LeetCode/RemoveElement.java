package LeetCode;

public class RemoveElement {
	
	public static int removeElement(int [] arr,int value) {
		int i=0;
		for(int j=0; j<arr.length;j++) {
			
			if(arr[j]!=value) {
				arr[i]=arr[j];
				i++;
			}
		}
		
		return i;
	}
	
	public static int removeElement1(int [] arr,int  value) {
		int j= arr.length,i=0;
		while(i<j) {
			if(arr[i]==value) {
				arr[i]=arr[j-1];
				j--;
			}
			else {
			i++;
			}
		}
		
		
		return j;
	}

}
