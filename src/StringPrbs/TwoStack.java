package StringPrbs;

public class TwoStack {
	int [] arr;
	int top1,top2;
	TwoStack(int n){
		this.arr=new int[n];
		top1=-1;
		top2=n;
	}
	public void push1(int data) {
		if(top1<top2-1) {
			top1++;
			arr[top1]=data;
		}
		else {
			System.out.print("stack overflow.....");
		}
	}
	public void push2(int data) {
		
		if(top1<top2-1) {
			top2--;
			arr[top2]=data;
		}
		else {
			System.out.print("stack overflow.....");
		}
	}
    public int pop1() {
    	int top=-1;
    	if(top1>=0) {
    		top=arr[top1];
    		top1--;
    	}
    	return top;
    }
    public int pop2() {
    	int top=-1;
    	if(top2<arr.length) {
    		top=arr[top2];
    		top2++;
    	}
    	return top;
    }
    public int peek1() {
    	if(top1>=0) {
    		return arr[top1];
    	}
    	return -1;
    }
    public int peek2() {
    	if(top2<arr.length) {
    		return arr[top2];
    	}
    	return -1;
    }
}
