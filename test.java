package tp6;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		
		

		System.out.println("******* IterableArrayList<Integer> test ********");
		
		IterableArrayList<Integer> test = new IterableArrayList<Integer>();
		
		for(int i = 0; i < 7; i++) {
			test.add (new Integer(i));
		}
		
		for (Integer i : test) {
			System.out.println(i);
		}
		
		System.out.println("=> test.remove(new Integer(5)); ");
		test.remove(new Integer(5));

		for (Integer i : test) {
			System.out.println(i);
		}

		System.out.println("******* IterableLinkedList<String> test ********");
		
		IterableLinkedList<String> l = new IterableLinkedList <String>();
		l.add ( new String (" Bonjour " ));
		l.add ( new String (" Monsieur " ));
		l.add ( new String (" George " ));

		// ( a )
		/*for(int i = 0; i < l.size(); i++) {
			System.out.println(i + " - " +l.get(i) );
		}*/
		for (String i : l) {
			System.out.println(i);
		}
		
		System.out.println("=> l.pop(); ");
		l.pop();
		
		// ( b )
		for (String i : l) {
			System.out.println(i);
		}
		
		System.out.println("=> l.remove (new String (\" George \" )); ");
		l.remove (new String (" George " ));
		
		// ( c )
		for (String i : l) {
			System.out.println(i);
		}
			
	}
	
}
