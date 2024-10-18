import java.util.Collection;
import java.util.LinkedList;


class CollectionPractical1{
	public CollectionPractical1(){
		int size;
		Collection<Integer> c = new LinkedList<>();
		c.add(1);
		c.add(3);
		c.add(5);
		c.add(8);
		c.add(7);
		
		boolean isEmpty = c.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println(c);
		
		size = c.size();
		System.out.println(size);
		
		boolean contains = c.contains(5);
		System.out.println(contains);
		
		c.remove(5);
		System.out.println(c);
	}
	public static void main(String[] args){
		new CollectionPractical1();
	}
}