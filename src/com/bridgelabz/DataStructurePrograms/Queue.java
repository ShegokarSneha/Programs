package com.bridgelabz.DataStructurePrograms;

public class Queue<T> {
	
	@SuppressWarnings("hiding")
	class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	Node<T> head;
	Node<T> front;
	Node<T> rear;
	int size;
	
	public Queue() {
        front = null;
        rear = null;
        size = 0;
    }
	public void enQueue(T item)
	{
		Node<T> newNode = new Node<T>(item);
		newNode.data = item;
		newNode.next = null;
		
		if(head==null)
			head = newNode;
		else {
			Node<T> tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	
	public T deQueue() {
		T value = head.data;
		head = head.next;
		return value;
		
		}
	
	public void display() {
		Node<T> tempNode = head;
		while(tempNode!=null){
			System.out.print(tempNode.data.toString()+" ");
			tempNode = tempNode.next;
		}
	}

	public int size() {
		int length = 0;
	       Node<T> current = head;  // Starts counting from head - first node
	       while(current != null){
	           length ++;
	         
			current = current.next;
	       }
	       return length;
	}

	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
	