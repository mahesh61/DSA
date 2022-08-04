package StringPrbs;

import java.util.ArrayList;
import java.util.Arrays;

public class XXXXXX {
	
	public static void reverseArray(ArrayList<Integer> arr, int m) {
		 int n=arr.size(),i=m+1,j=n-1;
	        while(i<j){
	            int temp=arr.get(i);
	           arr.add(i,arr.get(j));
	             arr.add(j,temp);
	            i++;
	            j--;
	        }
		System.out.print(arr);
	}
	
		 public static void moveZerosToLeft(int[] A) {
		    if (A.length < 1) {
		      return;
		    }

		    int writeIndex = A.length - 1;
		    int readIndex = A.length - 1;

		    while(readIndex >= 0) {
		      if(A[readIndex] != 0) {
		        A[writeIndex] = A[readIndex];
		        writeIndex--;
		      }

		      readIndex--;
		    }

		    while(writeIndex >= 0) {
		      A[writeIndex] = 0;
		      writeIndex--;
		    }
		  }
		 public static String getCompressedString(String str) {
				// Write your code here.
		        int count=1;
		        String result="";
		        for(int i=0;i<str.length();i++)
		        {
		            if((i==str.length()-1)||str.charAt(i)!=str.charAt(i+1))
		            {
		             if(count!=1)
		             {
		                result=result+str.charAt(i)+count;
		                count=1;
		             }
		                else
		                {
		                    result=result+str.charAt(i);
		                     count=1;
		                }
		              
		            }
		            else 
		            {
		                count++;               
		            }
		        }
		        return result;
			}

		}  


