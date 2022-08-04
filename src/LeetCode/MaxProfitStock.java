package LeetCode;

import java.util.ArrayList;

public class MaxProfitStock {
	
	
	public static int maxProfit(ArrayList<Integer> arr) {
	
		int maxProfit=0, buy=0;
		int n=arr.size();
		int currentProfit;
		for(int i=0;i<n-1;i++) {
			buy=arr.get(i);
			for(int j=i+1;j<n;j++) {
				currentProfit=Math.max(maxProfit,(arr.get(j)-buy));
			}
			
		}
		
		return 1;
	}

}
