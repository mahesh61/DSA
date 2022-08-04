package StringPrbs;

public class MinHeap {
 int[] arr;
 int capacity;// max capacity
 int heap_size;// current value in heap
 
MinHeap(int[] a,int capacity){
	 this.heap_size=capacity;
	 this.arr=a;
	 int i=(heap_size-1)/2;
	 while(i>=0) {
		 minHeapify(i);
		 i--;
	 }
 }

 int parent(int i) {return (i-1)/2;}
 int left(int i) {return ((2*i)+1);}
 int right(int i) {return ((2*i)+2);}
 int getMin() {return arr[0];}
 int extractMin(){
	 if(heap_size==0) {
		 return Integer.MAX_VALUE;
	 }
	 return 0;
 }
 void minHeapify(int i){
	 int l=left(i);
	 int r=right(i);
	 int smallest=i;
	 if(l<heap_size&&arr[l]<arr[i]) {
		 smallest=l;
	 }
	 if(r<heap_size&&arr[r]<arr[smallest]) {
		 smallest=r;
	 }
	 if(smallest!=i) {
		 int temp=arr[i];
		 arr[i]=arr[smallest];
		 arr[smallest]=temp;
		 minHeapify(smallest);
	 }
 }
}
