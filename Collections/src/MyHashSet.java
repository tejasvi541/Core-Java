//Contains unique elements
import java.util.*;
public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("ABCDE");
		hs.add("ABCD");
		hs.add("ABC");
		hs.add("AB");
		hs.add("A");
		hs.add("AB");
		hs.add("ABC");
		
	    int i = hs.hashCode();
	    System.out.println(i +" \n");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
