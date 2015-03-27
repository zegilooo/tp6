package tp6;

import tp6.LinkedList.Node;

public class LinkedList2<T> {
	private Node<T> head ;
	private int size;
	
	public LinkedList2 () { 
		this.head = new Node<T> ();
		this.size = 0;
	}
	
	public int size () { 
		return this.size;
	}
	
	public void addFirst (T e) {
		Node<T> tempo = new Node<T>(e);
		if(this.head.getNext()!=null){
			Node<T> first = this.head.getNext();
			tempo.setNext(first);	
			this.head.setNext(tempo);	
			tempo.setPrevious(this.head);	
		}else{
			this.head.setNext(tempo);
			tempo.setPrevious(this.head);	
		}
		this.size++;
	}
	
	public void addLast (T e) { 
		Node<T> tempo = new Node<T>(e);
		Node<T> current = this.head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(tempo);
		tempo.setPrevious(current);
		this.size++;
	}
	
	public void add(T e) {this.addLast (e);} // shortcut for addLast
	
	public T get (int i) { 
		if(i < 0 || i >= this.size ) {throw new ArrayIndexOutOfBoundsException (i); }
		Node<T> current = this.head;
		for(int j = 0; j < i+1 ; j++) {
			current = current.getNext();
		}
 		return (T) current.getData();
	}
	

	public T pop () { 
		T first = this.head.getNext().getData();
		this.remove(first);
		return first;
	}
	
	public T poll () { 
		return this.pop();
	}
	
	public T peekFirst () {
		T tempo = this.get(0);
		return tempo; 
	}
	
	public T peekLast () { 
		T tempo = this.get(this.size-1);
		return tempo; 		
	}
		
	public boolean remove (T e) { 
		Node<T> current = this.head;
		boolean test = false;
		while (current.getNext() != null && test == false) {
			if(current.getNext().getData().equals(e)){
				test = true;
				current.setNext(current.getNext().getNext());
				if(current.getNext() != null) current.getNext().setPrevious(current);
				this.size--;
			}else{
				current = current.getNext();
			}
		}
		return test;
	}
	
	public T remove (int i){
		T tempo = this.get(i);
		boolean test = this.remove(tempo);
		if(!test){
			return null;
			}
		return tempo; 	
	}

	class Node<E> {
		private E data;
		private Node<E> next;
		private Node<E> previous;
		
		public Node(){
			this.next = null;
			this.previous = null;
		}
		
		public Node(E e){
			this.data = e;
			this.next = null;
			this.previous = null;
		}
		
		public E getData() {
			return this.data;
		}
 
        public void setData(E e) {
        	this.data = e;
        }
 
        public Node<E> getNext() {
        	return this.next;
        }
 
        public void setNext(Node<E> next) {
        	this.next = next;
        }
 
        public Node<E> getPrevious() {
        	return this.previous;
        }
 
        public void setPrevious(Node<E> previous) {
        	this.previous = previous;
        }
	}	
}
