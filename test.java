package tp6;

public class test {

	public static void main(String[] args) {
		
		System.out.println("******* ArrayList<Integer> test ********");
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			test.add (new Integer(i));
		}
		
		for(int i = 0; i < test.size(); i++) {
			System.out.println(i + " - " +test.get(i) );
		}

		System.out.println("=> test.remove(new Integer(5)); ");
		test.remove(new Integer(5));

		for(int i = 0; i < test.size(); i++) {
			System.out.println(i + " - " +test.get(i) );
		}
		
		System.out.println("******* LinkedList<String> test ********");
		
		LinkedList<String> l = new LinkedList <String>();
		l.add ( new String (" Bonjour " ));
		l.add ( new String (" Monsieur " ));
		l.add ( new String (" George " ));

		// ( a )
		for(int i = 0; i < l.size(); i++) {
			System.out.println(i + " - " +l.get(i) );
		}
		
		System.out.println("=> l.remove (1); ");
		l.remove (1);
		
		// ( b )
		for(int i = 0; i < l.size(); i++) {
			System.out.println(i + " - " +l.get(i) );
		}
	}
	
}
