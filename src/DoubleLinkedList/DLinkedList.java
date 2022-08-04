package DoubleLinkedList;

public class DLinkedList {
	static void print(DoubleLinkedList list) {
        Node temp=list.head;
        while(temp!=null) {
        	System.out.print(temp.data+" ");
        	temp=temp.next;
        }
	}
	static DoubleLinkedList insertAtHead(DoubleLinkedList list,int data){
		Node newNode=new Node(data);
		if(list.head==null){
			list.head=newNode;
		}
		else {
		list.head.prev=newNode;
		newNode.next=list.head;
		list.head=newNode;
		}
		return list;
	}
    static DoubleLinkedList insertAtTail(DoubleLinkedList list,int data) {
    	Node temp= list.head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	Node newNode=new Node(data);
    	temp.next=newNode;
    	newNode.prev=temp;
    	return list;
    }
	static DoubleLinkedList insertAtPos(DoubleLinkedList list,int pos,int data){
		Node newNode =new Node(data);
		Node temp=list.head;
		int count=1;
		if(pos==1) {
			insertAtHead(list,data);
		}
		else {
			while(count<pos-1){
				temp=temp.next;
				count++;
			}
			newNode.next=temp.next;
			temp.next.prev=newNode;
			temp.next=newNode;
			newNode.prev=temp;
		}
		return list;
	}
    static DoubleLinkedList delete(DoubleLinkedList list,int pos) {
    	Node curr=list.head;
    	int count=1;
    	if(pos==1){
    		curr.next.prev=null;
    		curr.next=null;
    		list.head=curr;
    	}
    	else {
    		Node prev=null;
    		
    		while(count<pos) {
    			prev=curr;
    			curr=curr.next;
    			count++;
    		}
    		prev.next=curr.next;
    		curr.next.prev=prev;
    		curr.next=null;
    		curr.prev=null;
    	}
    	return list;
    }
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
        list=insertAtHead(list,1);
        list=insertAtHead(list,2);
        list=insertAtTail(list,7);
        list=insertAtPos(list,2,10);       
        list=delete(list,3);
        print(list); 
	}

}
