package ggf;

import java.util.HashMap;
import java.util.*;

public class HashMapPractice {
	
	public static ArrayList<Integer> duplicates(int[] arr) {
		HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
		ArrayList<Integer> result= new ArrayList<Integer>();
		for(int i:arr)
		{
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
			for(Integer m:map.keySet())
			{
				if(map.get(m)>1){
					result.add(m);
					System.out.println(m);
				}
				
			
			 
		}
		return result;
	}
	public static int kthLargest(int[] arr, int k){
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>(); 
		for(int x=0;x<arr.length;x++) 
		{
		  if(x<k) {
			  pq.add(arr[x]);
		  }
		  else {
			  if(arr[x]>pq.peek()) {
				  pq.remove();
				  pq.add(arr[x]);
			  }
		  }
		}
		
		return pq.peek();
	}
}

