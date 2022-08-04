package StringPrbs;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPractice {	
	public static int majorityElelment1(int[] arr) {

		int maxCount = 0, index = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}
		if (maxCount > (arr.length / 2)) {
			return arr[index];
		} else {
			return -1;
		}
	}
	public static int majorityElelment2(int[] arr) {
		Arrays.sort(arr);
		int count = 1;
		int prev = arr[0], maxCount = 0, ele = 0, f = 0;
		for (int i = 1; i < arr.length; i++) {
			if (prev == arr[i]) {
				count++;
			} else {
				count = 1;
				prev = arr[i];
			}
			if (maxCount < count) {
				maxCount = count;
				ele = arr[i];
				if (maxCount > (arr.length / 2)) {
					f = 1;
					break;
				}
			}
		}

		return f == 1 ? ele : -1;
	}
	public static void pairSum1(int[] arr, int sum) {
		Map<Integer, Integer> box = new HashMap<Integer, Integer>();
		// int[][] result= new int[][];
		for (int i = 0; i < arr.length; i++) {
			box.put(arr[i], i);
		}

		for (int j = 0; j < arr.length; j++) {
			int req = sum - arr[j];
			if (box.containsKey(req) && box.get(req) != j) {
				int a = Math.max(arr[j], arr[box.get(req)]);
				int b = Math.min(arr[j], arr[box.get(req)]);
				System.out.println(b + "" + a);
			}

		}

	}
	public static int[][] pairSum2(int[] arr, int sum) {
		int[][] res = new int[arr.length][2];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] + arr[i] == sum) {
					int a = Math.min(arr[i], arr[j]);
					int b = Math.max(arr[i], arr[j]);
					res[x][0] = a;
					res[x][1] = b;
					x++;
					// System.out.println(a+""+b);
				}
			}
		}
		return res;
	}
	// METHOD 1 (Simple Linear Search)
	public static MinMax findMinMax(int[] arr, int n) {
		MinMax minMax = new MinMax();
		if (n == 1) {
			minMax.max = arr[0];
			minMax.min = arr[0];
		}
		if (arr[0] > arr[1]) {
			minMax.max = arr[0];
			minMax.min = arr[1];
		} else {
			minMax.max = arr[1];
			minMax.min = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > minMax.max) {
				minMax.max = arr[i];
			} else if (arr[i] < minMax.min) {
				minMax.min = arr[i];
			}
		}

		return minMax;
	}
	public static int kthSmamllest1(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
	public static int kthSmallest2(int[] arr, int k) {

		return 0;
	}
	public static void moveNegToLeft(int[] a) {
		int left = 0, right = a.length - 1;
		while (left < right) {

			if (a[left] > 0 && a[right] < 0) {
				// swap();
				left++;
				right--;
			} else if (a[left] < 0 && a[right] < 0) {
				left++;
			} else if (a[left] > 0 && a[right] > 0) {
				right++;
			} else {
				left++;
				right--;
			}
		}
	}
	public static void moveNegToLeft2(ArrayList<Integer> a) {
		int left = 0, right = a.size() - 1;
		while (left <= right) {

			if (a.get(left) > 0 && a.get(right) < 0) {
				swap(a, left, right);
				left++;
				right--;
			} else if (a.get(left) < 0 && a.get(right) < 0) {
				left++;
			} else if (a.get(left) > 0 && a.get(right) >= 0) {
				right--;
			} else {
				left++;
				right--;
			}
		}
	}
	static void swap(ArrayList<Integer> a, int i, int j) {
		int temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);

	}
	static int[] rotate(int[] a, int d) {
		int p = 1;
		while (p <= d) {
			int last = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = last;
                 p++;
		}
		return a;
	}
    static int duplicate(ArrayList<Integer> arr) {
    	int ele=0;
    	HashMap<Integer,Integer> box= new HashMap<Integer,Integer>();
    	for(int i=0;i<arr.size();i++) {
    		if(box.containsKey(arr.get(i))) {
    			ele=arr.get(i);
    		}
    		else {
    			box.put(arr.get(i), i);
    		}
    	}
    	return ele;
    }
    public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
        int res=0;
        for(int i=0;i<arr.size()-1;i++){
            int ele=arr.get(i);
            for(int j=i+1;j<arr.size();j++){
                if(ele==arr.get(j)){
                    
                    res=ele;
                }
                
            }
           
        }
         return res;
	}
  // can not handle if array contains all negative elements
    static int largetSumContegiuos(int [] arr) {
    	int max_so_far=Integer.MIN_VALUE;
    	int max_ending=0;
    	for(int i=0;i<arr.length;i++){
    		max_ending=max_ending+arr[i];
    		
    		if(max_ending>max_so_far) {
    			max_so_far=max_ending;
    		}
    		if(max_ending<0) {
    			max_ending=0;    		}
    	}
    	return max_so_far;
    }
    static int largetSumContegiuos1(int[] arr) {
	   int curr_max=arr[0],max_so_far=arr[0];
	   for(int i=1;i<arr.length;i++) {
		   curr_max=Math.max(arr[i],curr_max+arr[i]);
		   max_so_far=Math.max(max_so_far, curr_max);
	   }
	   return max_so_far;
   }
    static int minStepsToEnd(int [] arr,int n) {
    	if(n<=1) {
    		return 0;
    	}
    	if(arr[0]==0) {
    		return -1;
    	}
    	int steps=arr[0];
    	int jumps=1,res=-1;
    	int maxreach=arr[0];
    	for(int i=1;i<n;i++) {
    		if(i==n-1){
    			res= jumps;
    		}
    		maxreach=Math.max(maxreach, i+arr[i]);
    		steps--;
    		if(steps==0) {
    			jumps++;
    			if(i>maxreach) {
    				res= -1;    				
    			}
    			steps=maxreach-i;
    		}
    	}
    	return res;
    }
    public static ArrayList<Integer> countTheNumber(ArrayList<Integer> arr, int n, int k) {
        // Write your code here
        HashMap<Integer,Integer> box=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int ele=arr.get(i);
            if(!box.containsKey(ele)){
            	 box.put(ele,1);
             
            }
            else{
            	   box.put(ele,(box.get(ele))+1);
            }
        }
        ArrayList<Integer> res= new ArrayList<Integer>();
        for(int key:box.keySet()){
            if(box.get(key)>=k/2) {
            	res.add(key);
            }
           
        }
        return res;
	}
    public static boolean solve(int[] arr) {
	   HashMap<Integer,Integer>  box= new HashMap<Integer,Integer>();
	  
	   return false;
   }
    public static int findUnique(int[] arr){
		//Your code goes here
    	int res=-1;
         HashMap<Integer,Integer> box=new HashMap<Integer,Integer>();
        for(int x=0;x<arr.length;x++){
          int  req=arr[x];
            if(!box.containsKey(req)){
               
               box.put(req,1);
            }
            else{
                 box.put(req,box.get(req)+1);
            }
        }
        
        Iterator <Integer> it = box.keySet().iterator();       //keyset is a method  
     while(it.hasNext())  
     {  
       int key=(int)it.next();  
        if(box.get(key)==1){
            res= key;
        }
     } 
      return res  ;
    }
    static int minimize(int[] A,int k) {
	  for(int i=0;i<A.length;i++) {
		  if(A[i]-k>0&&A[i]-k!=0){
			  A[i]=A[i]-k;
		  }
		  else {
			  A[i]=A[i]+k;
		  }
	  }
	   int res= (findMinMax(A,A.length).max-findMinMax(A,A.length).min);
	  
	  return res;
  }
    static void rearrange(int arr[]) {
    	int i=0,j=0,k=0;
    	int n=arr.length;
    	while(i<n&&k<n&&j<n){
    		if(k%2==0) {
    			if(arr[k]>0) {
    				i=k;
    				j=k;
    				while(i<n&&arr[i]>=0){
    					i++;
    				}
    				if(i>=n) {
    					break;
    				}
    				rotate(arr,j,i);
    			}
    		}
    		else {
    			if(arr[k]<0) {
    				i=k;
    				j=k;
    				while(j<n&&arr[j]<0) {
    					j++;
    				}
    				if(j>=n) {
    					break;
    				}
    				rotate(arr,i,j);
    			}
    		}
    		k++;
    	}
    }
    static void rotate(int[] arr,int beg,int end) {
    	int temp=arr[end];
    	for(int i=end-1;i>=beg;i--) {
    		
    		arr[i+1]=arr[i];
    	}
    	arr[beg]=temp;
    }
    static void rearrange2(int[] arr) {
    	ArrayList <Integer> pos=new ArrayList<Integer>();
    	ArrayList <Integer> neg=new ArrayList<Integer>();
    	for(int x:arr) {
    		if(x<0) {
    			neg.add(x);
    		}
    		else {
    			pos.add(x);
    		}
    	}
    	int pi=0,ni=0;
    	for(int i=0;i<arr.length;i++) {
    		if(i%2==0) {
    			if(pi<neg.size()) {
    			arr[i]=neg.get(pi);
    			pi++;
    			}
    		}
    		else {
    			if(ni<pos.size()) {
    			arr[i]=pos.get(ni);
    			ni++;}
    		}
    		
    	}
    }
    public static ArrayList<Pair> duplicate_char(String s, int n) {
        
        // Write your Code here
         ArrayList<Pair> res=new ArrayList<Pair>();
    HashMap<Character,Integer> box=new  HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char req=s.charAt(i);
            if(!box.containsKey(req)){
                box.put(req,1);
            }
            else{
                 box.put(req,box.get(req)+1);
            }
        }
        Iterator <Character> it = box.keySet().iterator();       //keyset is a method  
while(it.hasNext())  
{  
char key=(char)it.next();  
   Pair pair=new Pair(key,box.get(key)) ;
res.add(pair);
} 
        return res;
    }
    static boolean isIsomorphic(String s1,String s2) {
    	if(s1.length()!=s2.length()) {
    		return false;
    	}
    	HashMap<Character,Character> box1= new HashMap<Character,Character> ();
    	HashMap<Character,Boolean> box2= new HashMap<Character,Boolean> ();
    	for(int i=0;i<s1.length();i++) {
    		char c1=s1.charAt(i);
    		char c2=s2.charAt(i);
    		if(box1.containsKey(c1)==true) {
    			if(c2!=box1.get(c1)){
    				return false;
    			}
    		}
    		else {
    			if(box2.containsKey(c2)) {
    				return false;
    			}
    			else {
    				box1.put(c1, c2);
    				box2.put(c2, true);
    			}
    		}
    	}
      	
     return true;
    }
    static void mergeIntervals(Interval[] list) {
    	
    	Arrays.sort(list,new Comparator<Interval>() { 	
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start-o2.start;
			}
    	});
    	Stack<Interval> stack=new Stack<Interval>();
    	stack.push(list[0]);
    	for(int i=1;i<list.length;i++) {
    		Interval curr=list[i];
    		Interval top=stack.peek();
    		// not overlap case...
    		if(top.end<curr.start) {
    			stack.push(curr);
    		}
    		// for overlap case...
    		else if(top.end<curr.end) {
    			top.end=curr.end;
    			stack.pop();
    			stack.push(top);
    		}
    	}
    	List<Interval> res=new ArrayList<Interval>(stack);
    	for(Interval x:res) {
    		System.out.print(x.start+" "+x.end+",");
    	}
//    	while(!stack.isEmpty()) {
//    		System.out.print(stack.peek().start+" "+stack.peek().end+",");
//    		stack.pop();
//    	}
    	
    }
    static boolean subsetSum(int arr[],int k) {
    	int start=0, end=0,sum=0;
    	for( int i=0;i<arr.length;i++ ) {
    		sum=sum+arr[i];
    		end=i;
    		if(sum==k) {
    			return true;
    		}
    		if(sum>k) {    			
    			sum=sum-arr[start];
    			start++;
    		}
    		
    	}
    	return false;
    }
    public static void findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
 		
        HashSet <Integer> set1 = new HashSet <Integer>();
        HashSet <Integer> set2 = new HashSet <Integer>();
        for(int i:arr1){
            set1.add(i);
        }
         for(int i:arr2){
            set2.add(i);
        }
  
        System.out.print( set1.retainAll(set2));
       // ArrayList<Integer> res=new ArrayList<Integer>();
        
	}
    public static int maxProfit(int[] arr) {
             int buy=arr[0];
             int maxProfit=0;
             for(int i=1;i<arr.length;i++) {
            	 if(arr[i]<buy) {
            		 buy=arr[i];
            	 }
            	 else if(arr[i]-buy>maxProfit) {
            		 maxProfit=arr[i]-buy;
            	 }
             }
    	
    	return maxProfit;
    }
}
