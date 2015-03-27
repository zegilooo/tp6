package tp6;

import java.util.Iterator;

public class IterableLinkedList<T> implements Iterable<T>{
	private Node<T> head ;
	private int size;
	
	public IterableLinkedList () { 
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
		}else{
			this.head.next = tempo;
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
		
		public Node(){
			this.next = null;
		}
		
		public Node(E e){
			this.data = e;
			this.next = null;
		}
	}
	
	@Override
    public Iterator<T> iterator() {
        CustomIterator iterator = new CustomIterator(this);
        return iterator;
    }
 
    class CustomIterator implements Iterator<T>{
        private IterableLinkedList list;
        private int index;
 
        public CustomIterator(IterableLinkedList list) {
        	this.list = list;          
        }
 
        @Override
        public boolean hasNext() {
            if(index < this.list.size()){               
                return true;
            }
            return false;
        }
 
        @Override
        public T next() {
            if(hasNext()){
                T currentObject = (T) this.list.get(this.index);
                this.index++;
                return currentObject;
            }
            return null;
        }
 
        @Override
        public void remove() {
        	this.list.remove(this.index);
        }
 
    }
	
}
