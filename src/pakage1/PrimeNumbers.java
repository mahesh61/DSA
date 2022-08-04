package pakage1;

public class PrimeNumbers {
	
	public static String getPrimrNo(int n) {
		
		String primeNo="";
		int num=0;
		for(int i= 1; i<=n; i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
				if(count==2) {
					primeNo+=i+" ";
					
				}
			
		}
		
		return primeNo;
	}
	

}
