package LinkedListPrac;

import java.util.*;

public class LinkedListPrac {
	
	   public static void print(LinkedList list) {
		Node x=list.head;
		while(x!=null) {
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
	   public static LinkedList insertEnd(LinkedList list,int data) {   
		   
		   Node newNode=new Node(data);
		   if(list.head==null) {
			  list.head=newNode;
		   }else {
			   Node last=list.head;
			   while(last.next!=null) {
				   last=last.next;
			   }
			   last.next=newNode;
		   }
		   return list;
	   }
       public static LinkedList insertAtHead(LinkedList list,int data) {

    	   Node newNode=new Node(data);
    	   if(list.head==null){
    		  list.head=newNode;
    	   }
    	   else {
    		   newNode.next=list.head;
    		   list.head=newNode;
    	   }
    	   return list;
       }
       public static LinkedList insertAtPos(LinkedList list,int pos,int data) {
    	   Node newNode=new Node(data);
    	   int count=1;
    	   Node t=list.head;
    	  if(pos==1){
    		 newNode= list.head;
    		 list.head=newNode;
    	  }
    	  else {
    		  while(count<pos-1) {    			 
    			 t=t.next;
    			 count++;
    		  }
    		  newNode.next=t.next;
    		  t.next=newNode;
    	  }
    	  return list;
       }
       public static LinkedList deletePos(LinkedList list,int pos) {
    	   //delete first node.
    	   if(pos==1){
    		  Node x=list.head.next;
    		  x.next=null;
    		  list.head=x;
    	   }
    	   else {
    		   Node curr=list.head;
    		   Node prev=null;
    		   int count=1;
    		   while(count<pos) {
    			   prev=curr;
    			   curr=curr.next;
    			   count++;
    		   }
    		   prev.next=curr.next;
    		   curr.next=null;
    	   }
    	   return list;
       }
       // iterative method
       public static LinkedList reverse(LinkedList list) {
    	   Node prev=null,forward=null;
    	  Node curr=list.head;
    	  while(curr!=null) {
    		  forward=curr.next;
    		  curr.next=prev;
    		  prev=curr;
    		  curr=forward;
    	  }
    	 list.head= prev;
    	   return list;
       }
       static int length(LinkedList list) {
    	   int len=0;
    	   Node temp=list.head;
    	   while(temp!=null) {
    		   len++;
    		   temp=temp.next;
    	   }
    	   return len;
       }
       static Node middleNode(LinkedList list) {
        	Node temp=list.head;
        	int len=length(list);
        	int mid=(len/2);
        	while(mid>0) {
        		temp=temp.next;
        		mid--;
        	}
        	return temp;
        }
       static LinkedList addOne(LinkedList list) {
        	list=reverse(list);
        Node temp=list.head;int count=0;
        while(temp!=null&&count==0) {
        	if(temp.data==9&&temp.next==null) {
        		temp.data=1;
        		Node zero= new Node(0);
        		zero.next=list.head;
        		list.head=zero;
        		temp=temp.next;
        	}
        	else if(temp.next!=null&&temp.data ==9){
        		temp.data=0;
        		temp=temp.next;
        	}
        	else {
        		temp.data=temp.data+1;
        		temp=temp.next;
        		count=1;
        	}
        }
        	return reverse(list);
        }
       public static boolean isLooped(LinkedList list) {
    	   HashSet<Node>box= new HashSet<Node>();
    	   Node temp=list.head,prev=null;
    	   while(temp!=null) {
    		   if(box.contains(temp)) {
    			  prev.next=null;
    			   return true;
    		   }
    		   else {
    			   box.add(temp);
    		   }
    		   prev=temp;
    		   temp=temp.next;
    	   }
    	   return false;
       }
       //sorted list
       public static LinkedList removeDuplicates(LinkedList list) {
    	   Node temp=list.head ,prev=null;
    	   HashSet<Integer> box=new HashSet<Integer>();
    	  while(temp!=null) {
    		   if(box.contains(temp.data)) {
    			   prev.next=temp.next;
    			   
    			   temp=temp.next;
    		   }
    		   else {
    			   box.add(temp.data);
    			   prev=temp;
    			   temp=temp.next;
    		   }
    	   }
    	  return list;
       }
       //unsorted list..
       public static LinkedList removeDuplicate(LinkedList list) {
    	   Node ptr1=list.head,ptr2=null;;
    	   while(ptr1!=null) {
    		   ptr2=ptr1;
    		   while(ptr2.next!=null) {
    			   if(ptr1.data==ptr2.next.data) {
    				   ptr2.next=ptr2.next.next;
    			   }
    			   else {
    				   ptr2=ptr2.next;
    			   }
    		   }
    		   ptr1=ptr1.next;
    	   }
    	   
    	   return list;
       }
       public static void main(String[] args) {
     	  
      	 LinkedList list=new LinkedList();
     	 list= insertAtHead(list,1);
//      	 list= insertAtHead(list,2);
//      	 list= insertAtHead(list,3);
//      	 list=insertAtPos(list,2,4);
      	 list=insertEnd(list,6);
    	 list=insertEnd(list,1);
    	 list=insertEnd(list,3);
      	 list=insertEnd(list,6);
    	 list=insertEnd(list,1);
    	 list=insertEnd(list,3);
      	 list=insertEnd(list,6);
    	 list=insertEnd(list,1);
    	 list=insertEnd(list,9);
      	 print(list);
      	 System.out.println();
      	 list=removeDuplicate(list);
      	 print(list);
        }
        
       
}
 