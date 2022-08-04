package ggf;

import java.util.*;

public class StackPractice {
	
	public static ArrayList<Integer> rightLargestNearest(int [] arr) {
		ArrayList<Integer> result= new ArrayList<Integer>();
 		Stack <Integer>stk= new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--){
			if(stk.size()==0){
				result.add(-1);
			}
			else if(stk.size()>0&&stk.peek()>arr[i]){
			  result.add(stk.peek());
			}
			else if(stk.size()>0&&stk.peek()<=arr[i]) 
			{
				while(stk.size()>0&&stk.peek()<=arr[i])
				{
					stk.pop();
				}
				if(stk.size()==0) 
				{
					result.add(-1);
				}
				else 
				{
					result.add(stk.peek());
			    }
			}
          stk.push(arr[i]);
		}
		return result;
	}

	public static ArrayList<Integer> nearestGraeterToLeft(int[] arr){
		ArrayList<Integer> result= new ArrayList<Integer>();
		Stack<Integer> stk = new Stack<Integer>();
		for(int i=0; i<arr.length;i++) 
		{
			if(stk.size()==0) {
				result.add(-1);
			}
			else if(stk.size()>0&&stk.peek()>arr[i]) {
				result.add(stk.peek());
			}
			else if(stk.size()>0&&stk.peek()<=arr[i]) {
				while(stk.size()>0&&stk.peek()<=arr[i]) {
					stk.pop();
				}
				if(stk.size()==0) {
					result.add(-1);
				}
				else {
					result.add(stk.peek());
				}
			}
			stk.push(arr[i]);
		}
		
     return	result;
	}
	
	
	public static boolean validate(String exp){
		
		Stack<Character> stk= new Stack<Character>();
		for(int i=0; i<exp.length();i++)
		{
			if(exp.charAt(i)=='('||
			 exp.charAt(i)=='{'||
			 exp.charAt(i)=='[') 
			{
				stk.push(exp.charAt(i));
			}
			else
			{
			  if(!stk.empty()) 
			  {
				  char t= stk.peek();
					if((t=='{'&& exp.charAt(i)=='}')||
						(t=='('&& exp.charAt(i)==')')||
					    (t=='['&& exp.charAt(i)==']')) {
						stk.pop();
					}
					else {
						return false;
					}
				  
			  }
			  else{
				 return false; 
			  }
			}
			
		}
		
		if(stk.empty()) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	
	public static Stack<Integer> sortStack(Stack <Integer> stk){
		if(stk.empty()) {
			return stk;
		}
		int t= stk.peek();
		stk.pop();
		sortStack(stk);
		insertSortedly(stk,t);
		
		return stk;
	}
	public static void  insertSortedly(Stack <Integer> stk,int n){
		if((stk.empty())||(!stk.empty()&&stk.peek()<n)) {
			stk.push(n);
			return ;
		}
		int t= stk.peek();
		stk.pop();
		insertSortedly(stk,n);
		stk.push(t);
	}
	
}
