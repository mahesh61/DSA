package ggf;

public class SearchingAlgos {
	
	public static int binarySearch(int[] arr,int key) {
		  
		int mid , s=0,e=arr.length-1;
		
		mid= s+(e-s)/2;
		while(s<=e) {
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]){
				s=mid+1;
			}
			else if(key<arr[mid]) {
				e=mid-1;
			}
			
			mid=s+(e-s)/2;
		}
		
		return -1;
	}

	public static int leftOccurence(int [] arr,int key){
		int mid,s=0,e=arr.length-1;
		int ans=-1;
		mid=s+(e-s)/2;
		while(s<=e)
		{
			if(arr[mid]==key) {
				ans=mid;
				e=mid-1;
			}
			
			else if(key>arr[mid]) {
				s=mid+1;
			}
			else if(key <arr[mid]) {
				e=mid-1;
			}
			mid= s+(e-s)/2;
		}
		return ans;
	}
	
	public static int rightOccurence(int[] arr, int key){
		int mid, s=0,e=arr.length-1,ans=-1;
		mid=s+(e-s)/2;
		while(s<=e) {
			if(arr[mid]==key) {
				ans=mid;
				s=mid+1;
			}
			else if(key>arr[mid]) {
				s=mid+1;
			}
			else if(key<arr[mid]) {
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		
		return ans;
	}
}
