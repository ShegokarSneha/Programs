package com.bridgelabz.DataStructurePrograms;

public class LinkedList<T> {
    Node <T> head;
    
    public void linklist() {
    	head = null;
    }
    
    public void add(T item) 
	{
		Node<T> newNode = new Node<T>();
		newNode.value = item;
		newNode.setNextNode(null);
		
		if(head==null)
			head = newNode;
		else {
			Node<T> tempNode = head;
			while(tempNode.getNextNode() != null) {
				tempNode = tempNode.getNextNode();
			}
			tempNode.setNextNode(newNode);
		}
	}
	
	public void remove(T item) {
		Node<T> start = head;
		Node<T> previous = start;
		do {
		  if(item.equals(head.getValue())) {
			 start = start.getNextNode();
			  head = start;
		  }
		  else if(!start.getValue().equals(item)) {
			  previous = start;
			  start = start.getNextNode();
		  }
		  else {
			  start = start.getNextNode();
			  previous.setNextNode(start);;
			  
		  } 
		}while(start != null);
	}
	public boolean search(T item) {
		Node<T> start = head;
		while(start != null) {
			if(start.getValue().equals(item)) {
			return true;
			}
			else {
			start = start.getNextNode();
			}
		}
		return false;
		}
	
	public boolean isEmpty() {
		  if(size() == 0) {
			  return true;
		  }
		  else {
			 return false;
		  }
		  
	  }
	  
	public int size() {
		  int length = 0;
	       Node<T> current = head;  // Starts counting from head - first node
	       while(current != null){
	           length ++;
	         
			current = current.getNextNode();
	       }
	       return length;
	    }


	@SuppressWarnings("null")
	public void append(T item) {
		  Node <T> start = head;
		  if(start == null) {
			  start.setValue(item);
		  }
		  while(start != null) {
			  start.getNextNode();
		  }
		  start.getNextNode().setValue(item);
	  }
	  
	  public Node<T> index(T item) {
		Node <T> start = head;
		  if(start.getValue() != item) {
			  start.getNextNode();
		  }
		  return start;
	  }
	 
	@SuppressWarnings("null")
	public void insert(int position,T item) {
		
		Node<T> current = head;
		  Node<T> nNode = null;
		  int count = 1;
		if(position < 1 || position > size()+1) {
			System.out.println("Position can not Be Less Than 1");
		}
		if(position == 0) {
			nNode.setValue(item);
			nNode.setNextNode(current);
		}
		else {
		while(current != null) {
			if(count == position) {
				nNode.setNextNode(current.getNextNode());
				current.setNextNode(nNode);
				nNode.setValue(item);
			}
			else {
				count++;
				current.getNextNode();
			}
		}
			if(position == size()+1) {
				current.setNextNode(nNode);
				nNode.setValue(item);
				nNode.setNextNode(null);
				}
			}
		}

	public T pop() {
		Node<T> current = head;
		while(current.getNextNode() != null) {
			current.getNextNode();
		}
		T item = current.getValue();
		current.setValue(null);
		return item;
		}
	public T pop(int position) {
		Node<T> current = head;
		int count = 0;
		T item = null;
		while(current != null) {
			if(count == position) {
				item = current.getValue();
				current.setValue(null);
			}
			else {
				count++;
				current.getNextNode();
			}
		}
		return item;
	}
	
	public void display() {
		Node<T> tempNode = head;
		while(tempNode!=null){
			System.out.print(tempNode.getValue().toString()+" ");
			tempNode = tempNode.getNextNode();
		}
		}
	
	public T pollFirst() 
	{
		T value = head.getValue();
		head = head.getNextNode();
		return value;
	}
	
}
