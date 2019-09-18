package iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {

		Container names = new NameReposity();
		
		Iterator iterator = names.getIterator();
		while(iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
		
	}

}
