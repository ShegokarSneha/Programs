package com.bridgelabz.DataStructurePrograms;

class Node<T> {
	public T value;
	public Node<T> next;
	
	public Node(T item) {
		this.value = item;
	}

	public Node() {
		
	}

	public T getValue() {
		return value;
		}
	    
	public void setValue(T value) {
	    this.value = value;
	    }
	    
	public Node<T> getNextNode() {
	    return next;
	    }
	    
	public void setNextNode(Node<T> Node) {
	    this.next = Node;
	}
	
}
	
