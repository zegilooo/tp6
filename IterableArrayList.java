package tp6;

import java.util.Iterator;

public class IterableArrayList<T> implements Iterable<T>{ 
	private static final int DEFAULT_CAPACITY = 10;
	private T[] data ;
	private int size = 0;
    private int capacity = 0;
	
	public IterableArrayList () { 
		this.data = (T []) new Object [DEFAULT_CAPACITY]; 
		this.capacity = DEFAULT_CAPACITY;
		}
	
	public int size () { 
		return this.size ; 
		}
	
	public void add (T e) {
		if(e == null) { throw new NullPointerException();}
		ensureCapacity ();
		this.data [this.size] = e ;
		++ this.size ;
	}
	
	public T get (int i) {
		if(i < 0 || i >= this.size ) {throw new ArrayIndexOutOfBoundsException (i); }
		return this.data [i];
	}
	
	public int indexOf (T e) {
		if(e == null) { throw new NullPointerException();}
		for(int i = 0; i < this.size; i++) {
            if(data[i].equals(e)) {
                return i;
            }
		}
		return -1;
	}
	
	public T remove (int i ) { 
		if(i < 0 || i >= this.size ) {throw new ArrayIndexOutOfBoundsException (i); }
		T tempo = this.data[i];
		for(int j = i + 1; j < this.size; j++) {
			this.data[j - 1] = this.data[j];
			}
		this.size--;
		return tempo;
	}
	
	public boolean remove (T e) {
		int index = this.indexOf(e);
        if(index == -1) {
            return false;
        }
        this.remove(index);
        return true;
	}
	
	private void ensureCapacity () { 
		if(this.size == this.capacity) {
			this.capacity += DEFAULT_CAPACITY;
			T[] newData = (T[]) new Object[capacity];
			for(int i = 0; i < this.size; i++) {
				newData[i] = this.data[i];
			}
			this.data = newData;
		}
	}
	
	@Override
    public Iterator<T> iterator() {
        CustomIterator iterator = new CustomIterator(this);
        return iterator;
    }
 
    class CustomIterator implements Iterator<T>{
        private IterableArrayList list;
        private int index;
 
        public CustomIterator(IterableArrayList list) {
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
