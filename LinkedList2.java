package tp6;

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
		if(this.head.next!=null){
			Node<T> first = this.head.next;
			tempo.next = first;	
			this.head.next = tempo;	
			tempo.previous = this.head;	
		}else{
			this.head.next = tempo;
			tempo.previous = this.head;	
		}
		this.size++;
	}
	
	public void addLast (T e) { 
		Node<T> tempo = new Node<T>(e);
		Node<T> current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = tempo;
		tempo.previous = current;
		this.size++;
	}
	
	public void add(T e) {this.addLast (e);} // shortcut for addLast
	
	public T get (int i) { 
		if(i < 0 || i >= this.size ) {throw new ArrayIndexOutOfBoundsException (i); }
		Node<T> current = this.head;
		for(int j = 0; j < i+1 ; j++) {
			current = current.next;
		}
 		return (T) current.data;
	}
	

	public T pop () { 
		T first = this.head.next.data;
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
		while (current.next != null && test == false) {
			if(current.next.data.equals(e)){
				test = true;
				current.next = current.next.next;
				if(current.next != null) current.next.previous = current;
				this.size--;
			}else{
				current = current.next;
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

	}	
}
