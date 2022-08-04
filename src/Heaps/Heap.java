package Heaps;

public class Heap {
	//int capacity;
  //int[] arr= new int[capacity];
  
  //Heap( int capacity) {
	//  this.capacity=capacity;
 // }
  // for i th element (i-1)/2 is parent node
  public int parent(int[] arr,int i) {
	  if(i<=0||i>=arr.length) {
		  return -1;
	  }
	  int parentIdex=(i-1)/2;
	  int parent=arr[parentIdex];
	  return parent;
  }
  public int leftChild(int []arr,int i) {
	  int left=2*i+1;
	  if(left>=arr.length) {
		  return -1;
	  }
	  return left;
  }
  
  public int rightChild(int []arr,int i) {
	  int right=2*i+2;
	  if(right>=arr.length) {
		  return -1;
	  }
	  return right;
  }
  public void percolateDown(int[] arr,int i){
	  int l,r, max,temp;
	  l=leftChild(arr,i);
	  r=rightChild(arr,i);
	  if(l!=-1&&arr[l]>arr[i]){
		  max=l;
	  }
	  else {
		  max=i;
	  }
	  if(r!=-1&&arr[r]>arr[max]){
		 max=r; 
	  }
	  if(max!=i){
		  //swap i and max
		  temp=arr[i];
		  arr[i]=arr[max];
		  arr[max]=temp;
	  }
	  percolateDown(arr,max);
  }
}
