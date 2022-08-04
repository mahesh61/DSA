package StringPrbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Driver {
	
	 public static void main(String[] args) {
		 TwoStack twStack= new TwoStack(10);
		 
		 
		 twStack.push1(1);
		 twStack.push1(2);
		 twStack.push1(3);
		 twStack.push2(6);
		 twStack.push2(5);
		 twStack.push2(4);
		 
		 System.out.println(twStack.peek1()+" top values "+twStack.peek2());
		 //MinMax s=ArrayPractice.findMinMax(arr, arr.length);
		 //System.out.println(s.min+" "+s.max );
		 
		 //char[] x=s.toCharArray();
		
		 //char c='c';
		 //System.out.println();		
		 //StringPractice.findPermutations("ABC");		
		 //int s=0;
		 //arr.size();		 
		 //int x= arr.get(0)
//		 Scanner sc= new Scanner(System.in);
			/*
			 * int n=sc.nextInt(); int[] arr =new int[n]; for(int i=0;i<n;i++) {
			 * arr[i]=sc.nextInt(); }
			 */
		 
		 ArrayList<Integer> l= new ArrayList<Integer>();
		// l.toArray()
//		 l.add(-23);
//		 l.add(48);
//		 l.add(-13);
//		 l.add(31);
//		 l.add(-12);
//		 l.add(6);
//		 l.add(-42);
//		 l.add(23);
//		 l.add(14);
//		 l.add(33);
//		 l.add(-33);
//		 l.add(-21);
//		 l.add(0);
//		 l.add(25);
//		 l.add(-39);
//		 l.add(-31);
//		 //System.out.println(l);
//		 
//		 
//		 ArrayList<Integer> a= new ArrayList<Integer>();
//		a.add(1);//6 3 1 5 4 3 2
//		a.add(1);
//		a.add(2);
//		a.add(1);
//		a.add(2);
//		a.add(4);
//		a.add(3);
//		a.add(4);
		
		//int [] a3 = {-4 ,-10, -7 ,-1, 4, 10, 7, 1 };
		//String s="APPLE";//  
//		Interval[] array=  {
//				new Interval(1,3),
//				new Interval(2,4),
//				new Interval(6,8),
//				new Interval(9,10)
//		};
		
//		for(int v:a3) { 
		   //String exp = "a+b*(c^d-e)^(f+g*h)-i";
//	     String exp="abcde";
//	     String exp2="abcde";
//	     System.out.print(exp==exp2);
//	     System.out.print(exp.equals(exp2));
//	     
	    // exp.toCharArray()
	  // exp.equalsIgnoreCase(exp)
			//System.out.print(StringPractice.stringReverse(exp.toCharArray()));
			
//		}
		   //abcd^e-fgh*+^*+i-
   int[] inp= {7,1,5,3,6,4};
		 System.out.println(ArrayPractice.maxProfit(inp));
	   
	 }
	
}
