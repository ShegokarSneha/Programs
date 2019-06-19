package com.bridgelabz.DataStructurePrograms;

public class StackElement<T> {
	T value;
	StackElement<T> next;
	public StackElement(T item, StackElement<T> top) {
		this.next = top;
		this.value = item;
	}

	public StackElement<T> getNext() {
	    return next;
	    }
	
	public T getValue() {
		return value;
		}
}
