package tp6;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		
		

		System.out.println("******* ArrayList<Integer> test ********");
		
		IterableArrayList<Integer> test = new IterableArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			test.add (new Integer(i));
		}
		
		for (Integer i : test) {
			System.out.println(i);
		}
		
		/*for(int i = 0; i < test.size(); i++) {
			System.out.println(i + " - " +test.get(i) );
		}*/
		

		System.out.println("=> test.remove(new Integer(5)); ");
		test.remove(new Integer(5));

		for (Integer i : test) {
			System.out.println(i);
		}
				
		/*for(int i = 0; i < test.size(); i++) {
			System.out.println(i + " - " +test.get(i) );
		}*/
		
		/*
		System.out.println("******* LinkedList<String> test ********");
		
		LinkedList<String> l = new LinkedList <String>();
		l.add ( new String (" Bonjour " ));
		l.add ( new String (" Monsieur " ));
		l.add ( new String (" George " ));

		// ( a )
		for(int i = 0; i < l.size(); i++) {
			System.out.println(i + " - " +l.get(i) );
		}
		
		System.out.println("=> l.pop(); ");
		l.pop();
		
		// ( b )
		for(int i = 0; i < l.size(); i++) {
			System.out.println(i + " - " +l.get(i) );
		}
		
		System.out.println("=> l.remove (new String (\" George \" )); ");
		l.remove (new String (" George " ));
		
		// ( c )
		for(int i = 0; i < l.size(); i++) {
			System.out.println(i + " - " +l.get(i) );
		}
		
	System.out.println("******* LinkedList2<String> test ********");
		
		LinkedList2<String> l2 = new LinkedList2 <String>();
		l2.add ( new String (" Bonjour " ));
		l2.add ( new String (" Monsieur " ));
		l2.add ( new String (" George " ));
		l2.add ( new String (" Lang " ));

		// ( a )
		for(int i = 0; i < l2.size(); i++) {
			System.out.println(i + " - " +l2.get(i) );
		}
		
		//System.out.println("=> l2.remove (1); ");
		//l2.remove (1);
		System.out.println("=> l2.pop ();");
		l2.pop ();
		// ( b )
		for(int i = 0; i < l2.size(); i++) {
			System.out.println(i + " - " +l2.get(i) );
		}
		
		System.out.println("=> l2.remove (new String (\" Lang \" )); ");
		l2.remove (new String (" Lang " ));
		
		// ( c )
		for(int i = 0; i < l2.size(); i++) {
			System.out.println(i + " - " +l2.get(i) );
		}
			*/
	}
	
}
