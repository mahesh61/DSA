package ggf;
import java.util.Scanner;
public class PipeProblrm {

public static void isBalaced() {
	
	System.out.println("enter no of inlet out let AND FACTOR");
	Scanner sc= new Scanner(System.in);
	int i=sc.nextInt();
	int o=sc.nextInt();
	int f= sc.nextInt();
	int sumi=0,sumo=0;
	System.out.println("rated capacities inlets");
	for(int j=1 ; j<=i;j++) {
		int y=sc.nextInt()-f;
		sumi+=y;
	}
	System.out.println("rated capacities outlet");
	for(int j=1 ; j<=o;j++) {
		int yz=sc.nextInt()-f;
		sumo+=yz;
	}
	int diff=sumi-sumo;
	if(diff==0) {
		System.out.println("0");
	}
	if(diff<0) {
		
		System.out.println((-diff)+f);
	}
	if(diff>0) {
		System.out.println(-1*(diff+f));
	}
	
}
	
}
