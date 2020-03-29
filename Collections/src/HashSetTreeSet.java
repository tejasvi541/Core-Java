import java.util.*;
public class HashSetTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> my_set = new TreeSet<Integer>();
		for(int i = 0;i<5;i++) {
			my_set.add(new Integer((int)(Math.random()*100)));
		}
		System.out.println("Tree Set Elements : ");
		Iterator<Integer> it = my_set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("Try with for each");
		for(Integer myval:my_set) {
			System.out.println(myval);
		}
		my_set = new HashSet<Integer>();
		for(int i = 0;i<5;i++) {
			my_set.add(new Integer((int)(Math.random()*120)));
		}
		System.out.println("Has Set elements: ");
		it = my_set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Lets try with a function call\n");
		printsetElements(my_set);
	}
	public static void printsetElements(Set<Integer> temp) {
		for(Integer myval:temp) {
			System.out.println(myval);
		}
	}

}
