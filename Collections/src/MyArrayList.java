import java.util.*;
public class MyArrayList {

	public static void main(String[] args) {
			// ArrayList 1 = new ArrayList();
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("X");
		l.add("B");
		//l.add(10); //Autoboxing (Auto converts int into Integer Wrapper class);
		
		System.out.println("l= " + l);
		boolean bool = l.contains("X");
		System.out.println("Bool= " + bool);
		bool = l.contains("Y");
		System.out.println("Bool= " + bool);
		String s = (String)l.get(2);
		System.out.println("Element at Index 2= " + s);
		int i = l.indexOf("B");
		System.out.println("Index of B = " + i);
		
		for(int ii=0;ii<l.size();ii++)
		{
			System.out.println("l = " + l.get(ii));
			
		}
		for(String ss:l) {
			System.out.println("l = " + ss);
			
		}
		//It is used to transverse the elements of a collection
		Iterator <String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println("Array Element = " +it.next());
		}
		System.out.println("List before Iteration = " +l);
		
		//Iterator can remove item from a list while transversing arrayList.
		Iterator <String> it2 = l.iterator();
		while(it2.hasNext()) {
			String s2 = it2.next();
			if(s2.equals("X"))
				it.remove();
		}
		System.out.println(l);
		//Enumerations doesnt delete elements while transvering arraylist , but returns an enumeration.
		Enumeration<String> en = Collections.enumeration(l);
		while(en.hasMoreElements()) {
			String s3 = en.nextElement();
			System.out.println("Enumeration Elements = " + s3);
		}
		//Clean the array list
		l.clear();
		System.out.println("l = "+l);
	}

}
