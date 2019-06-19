package com.bridgelabz.DataStructurePrograms;

public class Deque<T> {
	
	@SuppressWarnings("hiding")
	class Node<T> {
		// This is object type data type for store data 
		T data;
		// This is node type data type for store node address
		Node<T> next;
		
		/**
		 * This is constructor of Node class
		 * @param data This is the first parameter of constructor.
		 */
		public Node(T data) {
			this.data = data;
		}
	}
	
	Node<T> head;
	int front;
	int rear;
	int size;
//************************ Constructor ***************************//
	/**
	 * This is the constructor of Deque to initialize instance member of class.
	 * @param capacity This is the parameter of constructor to initialized the capacity.
	 */
	public Deque() {
		head = null;
		front = rear = -1;
		size = 0;
	}
	
	
//*********************** addFront method *************************//
	
	/**
	 * This method is used to add item at Rear.
	 * @param item This is the parameter of addRear method for add item.
	 * @return Nothing.
	 */
	public void addRear(T item) {

		if(front == -1) {
			front=0;
		}
		
		// Creating the node.
		Node<T> node = new Node<T>(item);
		rear++;
		size++;
		
		//checking the head is null or not, if head null than element add at first position. 
		if(head == null) {
			head = node;
			return ;
		}
		
		// Assigning the head to the temporary variable temp.
		Node<T> temp = head;
		
		//while loop for moving to the last index.
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = node;
	}

	
//********************* addFront **************************//
	
	/**
	* This method is for add the element at first position
	* @param object This is the first parameter of addFront method.
    * @return Nothing.
	*/
	public void addFront(T object) {
	
		// Creating the node.
		Node<T> node = new Node<T>(object);
		size++;
		rear++;
		
		//assigning the node as first node.
		node.next = head;
		head = node;
	}
	
	
//************************* RemoveRear *************************//
		/**
		 * This method is used to remove element from rear.
		 * @return Object This returns the deleted element.
		 */
	public T removeRear() {
			
		//checking that deque has element or not
		if(rear == -1) {
			System.out.println("Queue is empty...");
			return null;
			}
			
			// for the deleted node information
		Node<T> temp = head;
			
			//for before the deleted node information
		Node<T> tempOne = null;
			
			//while loop for moving upto the last element
		while(temp.next != null) {
			tempOne = temp;
			temp = temp.next;
			}
			
		if(tempOne != null) {
			tempOne.next = null;
			}
		else {
			head = null;
			}
					
			//after deletion decrement the size of dequeue.
		size--;
		rear--;
		return temp.data;
		}
		
		
//******************** RemoveFront ***************************//
		
		
		/**
		 * This method is used to delete the item from front of the queue.
		 * @return Object This return deleted item.
		 */
	public T removeFront() {
			
		//checking that queue has element or not
		if(rear == -1) {
			System.out.println("Queue is empty...");
			return null;
			}
					
			//remove operation 
		T item = head.data;
		head = head.next;
				
			// After deleting decrement the size of deque.
		size--;
		rear--;
		return  item;
					
		}

//********************* size **********************//
		
		/**
		 * This method is used to find the size of the queue.
		 * @return int This return size of the queue.
		 */
		public int size() {
			
			return rear-front+1;
		}
			
			
//*********************** isEmpty **************************//
			
		/**
		 * This method is used to check queue is empty or not.
		 * @return boolean This return true if queue is empty 
		 * and return false if queue is not empty.
		 */
		public boolean isEmpty() {
			
			// checking that size is 0 or not.
			if(size == 0 ) {
				return true;
			}
			
			return false;
		}
		
			
//******************** toString method *************************//
			
		/**
		 * This is the toString method of queue for display the content of the queue
		 * rather than show fully classified name.
		 * @return String This return the element of the queue.
		 */
	public String toString() {
		String item = "[";
		Node<T> temp = head;
			
			//for loop to move upto last element .
		for(int i = front ; i <= rear;i++) {
			item = item + temp.data;
			if(i < rear) {
				item = item + " , ";
				}
			temp = temp.next;
			}
		item = item + "]";
		return item;
	}
	}
			
		
		
		
		
		
		
		
		
	