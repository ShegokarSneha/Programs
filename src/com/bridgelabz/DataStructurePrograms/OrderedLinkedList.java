package com.bridgelabz.DataStructurePrograms;

public class OrderedLinkedList<T extends Comparable<T> > {
	@SuppressWarnings("hiding")
	class Node<T>  {
		// This is generic type data type for store data 
		T data;
		// This is node type data type for store node address
		Node<T> next;
			
		
		public Node(T data) {
			this.data = data;
		}

		
	}
		
	// This is node type data type data type for head of linked list
	Node<T> head;
	//This is for size for keep record of linked list size.
	int size;

	
	public OrderedLinkedList() {
		head = null;
		size = 0;
	}
	
	

	public void add(T item) {
		
	// Creating the node.
		Node<T> node = new Node<T>(item);
		size++;
		// Assigning the head to the temporary variable temp.
		Node<T> temp=head;
		Node<T> temp1=head;
				
		//checking the head is null or not, if head null than element add at first position. 
		if(head == null) {
			head = node;
			return ;
		}
		if(item.compareTo(head.data)<0) {
			node.next = head;
			head = node;
			return;
		}
		
		if(item.compareTo(head.data)>0) {
			
		while(item.compareTo(temp.data)>0 && temp.next != null ) {
			temp1 = temp;
			temp = temp.next;
			
		}
		node.next = temp1.next;
		temp1.next = node; 
		if(item.compareTo(temp.data) > 0 && temp.next == null ){
			node = temp1.next;
			node.next = temp.next;
		}
		}
		
	}
	

	public boolean search(T item) {
		Node<T> temp = head;
		boolean	found = false;
		boolean	stop = false;
		// for loop to move upto the size of list.
		while(temp != null && found && stop) {
			if(temp.data == item) {
				found = true;
			}
			else {
				if(item.compareTo(temp.data)>0) {
					stop = true;
				}
				else {
					temp = temp.next;
				}
			}
		}
		return found;
	}
		

	public boolean isEmpty() {
				
		//checking size of list is zero or not.
		if(size == 0) {
			return true;
		}
		
		return false;	
	}
		

	public int size() {
		return size;
	}

	

	public int index(T item) {
		Node<T> temp = head;
		
		// for loop to move upto size of the list.
		for(int i=0;i<size;i++) {
			if(temp.data == item) {
				return i;
			}
			temp = temp.next;
		}
		
		return -1;
	}
	
			

	public T pop() {
		
		// Checking that list is empty or not.
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		
		// for the deleted node information
		Node<T> temp=head;
		
		//for before the deleted node information
		Node<T> tempOne = null;
		
		//while loop for moving upto the last element
		while(temp.next != null) {
			tempOne = temp;
			temp=temp.next;
		}
	
		if(tempOne != null) {
			tempOne.next = null;
		}else {
			head = null;
		}
			
		//after deletion decrement the size of list.
		size--;
		
		return  temp.data;
	}
		
	

	public T pop(int index) {
		
		//checking that index is in the range or not.
		if(index < 0 || index > size) {
			System.out.println("List is not in range");
		}
		
		Node<T> temp = head;
		int tempIndex = 0;
		
		// while loop to move upto one index before of deleted index.
		while(tempIndex < index-1) {
			temp = temp.next;
			tempIndex++;
		}
		
		T object = null;
		
		//doing deletion operation
		if(temp.next != null) {
			object = temp.next.data;
			temp.next = temp.next.next;
		}else {
			object = temp.data;
			head = null;
		}
		
		//decrement the size of list after deletion.
		size--;
		
		return object;
	}
						

	

	public void remove(T item) {
		Node<T> temp = head;
		Node<T> temp1 = temp;
		//checking that item is head data or not
		if(head.data .equals(item)) {
			head = head.next;
			size--;
			return;
		}
		//While loop to move upto the last element.
		while(temp.next != null) {
			
			//checking element is equal to given item or not.
			if(temp.next.data.equals(item)) {
				
				//removing the given item.
				temp.next = temp.next.next;
				
				size--;
				return;
			}
			temp1 = temp;
			temp = temp.next;
		}//end of while loop
		
		if(temp.next == null && temp.data.equals(item)) {
			temp1.next = null;
			size--;
		}
	}
	
	
	@Override
	public String toString() {
		String str = "[";
		Node<T> temp = head;
		
		//while loop for moving to the last element.
		while(temp != null) {
			str = str + temp.data;
			
			// move only one index before of last index.
			if(temp.next != null) {
				str = str + "->";
			}
			temp = temp.next;
		}
		return str + "]";
	}
	
	public void display() {
		Node<T> tempNode = head;
		while(tempNode!=null){
			System.out.print(tempNode.data.toString()+" ");
			tempNode = tempNode.next;
		}
}
	
	
	
}