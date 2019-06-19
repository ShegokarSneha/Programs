package com.bridgelabz.DataStructurePrograms;

public class Stack<T>{
	int size;
	StackElement<T> top;
			
public void push(T item) {
		StackElement<T> newElement = new StackElement<T>( item, top);
		top = newElement;
		size++;
	}
	public T pop() {
		StackElement<T> oldTop = top;
		if(size() == 0) {
		return null;
		}
		top = top.getNext();
		size--;
		return oldTop.getValue();
		}
	
	public T peek() {
		if(size() == 0) {
			return null;
			}
		return top.getValue();
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
	       StackElement<T> current = top;  // Starts counting from head - first node
	       while(current != null){
	    	   length ++;
	    	   current = current.getNext();
	       }
	       return length;
	    }

	
	}

