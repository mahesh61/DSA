package Heaps;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,7,5,6,8,3};
		Heap heap=new Heap();
		heap.percolateDown(arr, 0);
		System.out.println(arr[0]);
           
	}

}
