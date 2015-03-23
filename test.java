package tp6;

public class test {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> test = new ArrayList<Integer>();
		for(int i = 0; i < 50; i++) {
			test.add (new Integer(i));
		}

		System.out.println(test.size());
		System.out.println(test.get(49));
		
		*/
		
		LinkedList<Integer> test2 = new LinkedList<Integer>();
		for(int i = 0; i < 50; i++) {
			test2.addLast (new Integer(i));
		}

		System.out.println(test2.size());
		System.out.println(test2.get(0));
		
		
		test2.remove(new Integer(38));
		
		for(int i = 0; i < 49; i++) {
			System.out.println(i + " - " +test2.get(i) );
		}
	}
	

}
