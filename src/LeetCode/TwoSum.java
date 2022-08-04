package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum1( int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==(sum-arr[i])) {
					return new int[] {i,j};
				}
			}
		}
		
		
		return null;
	}
    public static int[] twoSum2(int[] arr,int sum) {
    	
    	Map<Integer, Integer> map= new HashMap<>();
    	
    	for(int i=0;i<arr.length;i++) {
    		map.put(arr[i], i);
    	}
    	
    	for(int j=0;j<arr.length;j++) {
    		int reqiured= sum-arr[j];
    		if(map.containsKey(reqiured)&&map.get(reqiured)!=j) {
    			return new int[] {j ,map.get(reqiured)};
    		}
    	}
    	return null;
    }
    
    public static int[] twoSum3(int[] arr, int sum) {
    	 
    	Map<Integer, Integer> map= new HashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		
    		int required = sum-arr[i];
    		if(map.containsKey(required)) {
    			return new int[] {map.get(required),i};
    			
    		}
    		
    		map.put(arr[i], i);
    	}
    	return null;
    }
}
