package ggf;

public class Recursion {
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
    public static int fibonacci(int n) {
    	if(n==0) {
    		return 0;
    	}
    	if(n==1) {
    		return 1;
    	}
    	int ans=fibonacci(n-1)+fibonacci(n-2);
    	System.out.print(ans);
    	return ans;
    }
}
