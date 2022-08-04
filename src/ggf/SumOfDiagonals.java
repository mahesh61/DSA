package ggf;
import java.util.Scanner;
public class SumOfDiagonals {

	public static void getcollisions() {
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] s= new int[n][m];
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			
			    if(s[i][j]==1){
			    	count++;
			  	
			    }
			    if(count>=2) {
					System.out.println("not posible");				}
			}
		}
		
	  
		
	}
}
